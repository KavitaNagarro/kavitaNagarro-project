package com.hybris.nagarro.core.job;

import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.model.ModelService;
public class OrderToSiteJobPerformable extends AbstractJobPerformable<CronJobModel> {

        private ModelService modelService;
        @Override
        public PerformResult perform(CronJobModel cronJobModel) {
            return null;
        }

        @Override
        public void setModelService(ModelService modelService) {
            this.modelService = modelService;
        }
}
