package cdm.legalagreement.csa.processor;

import com.regnosys.rosetta.common.translation.MappingContext;
import com.regnosys.rosetta.common.translation.Path;
import com.rosetta.model.lib.path.RosettaPath;

import java.util.List;

/**
 * ISDA Create mapping processor.
 */
@SuppressWarnings("unused")
public class MinimumTransferAmountAmendmentMappingProcessor extends org.isda.cdm.processor.MinimumTransferAmountAmendmentMappingProcessor {

	public MinimumTransferAmountAmendmentMappingProcessor(RosettaPath modelPath, List<Path> synonymPaths, MappingContext mappingContext) {
		super(modelPath, synonymPaths, mappingContext);
	}

}