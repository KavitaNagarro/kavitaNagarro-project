package com.hybris.nagarro.fulfilmentprocess.actions.order;


import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.orderprocessing.model.OrderProcessModel;
import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import de.hybris.platform.servicelayer.model.ModelService;
import org.apache.commons.collections4.CollectionUtils;
import com.hybris.nagarro.core.model.SellerModel;
import org.joda.time.LocalDate;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SetOrderDispatchDateAction extends AbstractSimpleDecisionAction<OrderProcessModel>{

    private ModelService modelService;

    @Override
    public Transition executeAction(OrderProcessModel orderProcessModel) throws Exception {
        final OrderModel orderModel = orderProcessModel.getOrder();
        Integer max = 1;
        Map<SellerModel,Integer> sellerMap = new HashMap<>();
        final List<AbstractOrderEntryModel> entrysOfSeller =
                orderModel.getEntries().stream().filter(e -> null != e.getSellerInfo()).toList();
        if (CollectionUtils.isNotEmpty(entrysOfSeller)) {
            entrysOfSeller.stream().forEach(e->{
                sellerMap.put(e.getSellerInfo(),e.getSellerInfo().getLeadTime());
            });
            max = Collections.max(sellerMap.values());
        }
        orderModel.setDispatchDate(new LocalDate().plusDays(max).toDate());
        modelService.save(orderModel);
        return Transition.OK;
    }

    @Override
    public void setModelService(ModelService modelService) {
        this.modelService = modelService;
    }
}