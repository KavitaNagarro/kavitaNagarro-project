package com.hybris.nagarro.core.dao.impl;

import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import com.hybris.nagarro.core.dao.OrderDao;

import java.util.Date;
import java.util.List;

public class DefaultOrderDaoImpl extends AbstractItemDao implements OrderDao {

    private FlexibleSearchService flexibleSearchService;

    @Override
    public List<AbstractOrderModel> getOrders(Date dispatchDate) {
        final StringBuilder sql = new StringBuilder("Select {PK} from {AbstractOrder} where {dispatchDate} = ?dispatchDate ");
        final FlexibleSearchQuery query = new FlexibleSearchQuery(sql.toString());
        query.addQueryParameter("dispatchDate", dispatchDate);
        final SearchResult<AbstractOrderModel> result = flexibleSearchService.search(query);
        return result.getResult();
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }
}
