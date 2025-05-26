package com.hybris.nagarro.core.dao;

import de.hybris.platform.core.model.order.AbstractOrderModel;

import java.util.Date;
import java.util.List;
public interface OrderDao {

    List<AbstractOrderModel> getOrders(Date dispatchDate);
}
