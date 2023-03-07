package org.apache.turbine.app.xnat.modules.actions;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.turbine.util.RunData;
import org.apache.velocity.context.Context;
import org.nrg.xft.XFTItem;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

import org.nrg.xdat.om.base.BaseXnatProjectdata;
import org.nrg.xft.security.UserI;
import org.nrg.xdat.om.ExProjectmetadata;
import org.nrg.xdat.om.XnatExperimentdata;
import org.nrg.xdat.turbine.modules.actions.ModifyItem;

public class ModifyExProjectMetadata extends ModifyItem {
    static Logger logger = Logger.getLogger(ModifyExProjectMetadata.class);

    public void preProcess(final XFTItem item, final RunData data, final Context context) {
        // Get project ID
        String projectId = (String) context.get("project");
        // Get all ExProjectmetadata
        List<ExProjectmetadata> projectMetadataList = ExProjectmetadata.getAllExProjectmetadatas(getUser(), false);
        // Find the one with current project ID
        List<ExProjectmetadata> matchingProjectMetadataList = projectMetadataList
            .stream()
            .filter(metadata -> metadata.getProjectData().getId().equals(projectId))
            .collect(Collectors.toList());
        // If matching is not empty, use the first element
        if (!matchingProjectMetadataList.isEmpty()) {
            ExProjectmetadata projectMetadata = matchingProjectMetadataList.get(0);
            projectMetadata.setExample("edit value from turbine");
            try {
                projectMetadata.save(getUser(), false, false, null);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        // Else create a new one
        } else {
            logger.log(null, matchingProjectMetadataList);
            // If the project does not have a ProjectMetadata object, create a new instance and save it
            ExProjectmetadata projectMetadata = new ExProjectmetadata(item);
            try {
                String id =  ExProjectmetadata.CreateNewID();
                projectMetadata.setId(id);
                // TODO: projectMetadata.getAbstractprojectasset().getGenericdata().getExperimentdata().setId(id);

            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            projectMetadata.setProject(projectId);
            projectMetadata.setExample("create value from turbine");
            try {
                projectMetadata.save(getUser(), false, false, null);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}