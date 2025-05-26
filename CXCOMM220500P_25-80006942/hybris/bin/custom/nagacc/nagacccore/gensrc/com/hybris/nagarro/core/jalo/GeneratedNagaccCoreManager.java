/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 26-May-2025, 8:12:43 am                     ---
 * ----------------------------------------------------------------
 */
package com.hybris.nagarro.core.jalo;

import com.hybris.nagarro.core.constants.NagaccCoreConstants;
import com.hybris.nagarro.core.jalo.ApparelProduct;
import com.hybris.nagarro.core.jalo.ApparelSizeVariantProduct;
import com.hybris.nagarro.core.jalo.ApparelStyleVariantProduct;
import com.hybris.nagarro.core.jalo.ElectronicsColorVariantProduct;
import com.hybris.nagarro.core.jalo.Seller;
import com.hybris.nagarro.core.jalo.SellerCarouselComponent;
import de.hybris.platform.basecommerce.jalo.site.BaseSite;
import de.hybris.platform.cms2.jalo.site.CMSSite;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.order.AbstractOrder;
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type <code>NagaccCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedNagaccCoreManager extends Extension
{
	/** Relation ordering override parameter constants for SellerToProduct from ((nagacccore))*/
	protected static String SELLERTOPRODUCT_SRC_ORDERED = "relation.SellerToProduct.source.ordered";
	protected static String SELLERTOPRODUCT_TGT_ORDERED = "relation.SellerToProduct.target.ordered";
	/** Relation disable markmodifed parameter constants for SellerToProduct from ((nagacccore))*/
	protected static String SELLERTOPRODUCT_MARKMODIFIED = "relation.SellerToProduct.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n ORDERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractOrder> CMSSITETOORDERORDERSHANDLER = new OneToManyHandler<AbstractOrder>(
	CoreConstants.TC.ABSTRACTORDER,
	false,
	"dispatchOrders",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("sellerInfo", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.AbstractOrderEntry", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("dispatchDate", AttributeMode.INITIAL);
		tmp.put("dispatchOrders", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.AbstractOrder", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagaccCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagaccCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagaccCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagaccCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public Seller createSeller(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagaccCoreConstants.TC.SELLER );
			return (Seller)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Seller : "+e.getMessage(), 0 );
		}
	}
	
	public Seller createSeller(final Map attributeValues)
	{
		return createSeller( getSession().getSessionContext(), attributeValues );
	}
	
	public SellerCarouselComponent createSellerCarouselComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( NagaccCoreConstants.TC.SELLERCAROUSELCOMPONENT );
			return (SellerCarouselComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SellerCarouselComponent : "+e.getMessage(), 0 );
		}
	}
	
	public SellerCarouselComponent createSellerCarouselComponent(final Map attributeValues)
	{
		return createSellerCarouselComponent( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.dispatchDate</code> attribute.
	 * @return the dispatchDate
	 */
	public Date getDispatchDate(final SessionContext ctx, final AbstractOrder item)
	{
		return (Date)item.getProperty( ctx, NagaccCoreConstants.Attributes.AbstractOrder.DISPATCHDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.dispatchDate</code> attribute.
	 * @return the dispatchDate
	 */
	public Date getDispatchDate(final AbstractOrder item)
	{
		return getDispatchDate( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.dispatchDate</code> attribute. 
	 * @param value the dispatchDate
	 */
	public void setDispatchDate(final SessionContext ctx, final AbstractOrder item, final Date value)
	{
		item.setProperty(ctx, NagaccCoreConstants.Attributes.AbstractOrder.DISPATCHDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.dispatchDate</code> attribute. 
	 * @param value the dispatchDate
	 */
	public void setDispatchDate(final AbstractOrder item, final Date value)
	{
		setDispatchDate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.dispatchOrders</code> attribute.
	 * @return the dispatchOrders
	 */
	public CMSSite getDispatchOrders(final SessionContext ctx, final AbstractOrder item)
	{
		return (CMSSite)item.getProperty( ctx, NagaccCoreConstants.Attributes.AbstractOrder.DISPATCHORDERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrder.dispatchOrders</code> attribute.
	 * @return the dispatchOrders
	 */
	public CMSSite getDispatchOrders(final AbstractOrder item)
	{
		return getDispatchOrders( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.dispatchOrders</code> attribute. 
	 * @param value the dispatchOrders
	 */
	public void setDispatchOrders(final SessionContext ctx, final AbstractOrder item, final CMSSite value)
	{
		item.setProperty(ctx, NagaccCoreConstants.Attributes.AbstractOrder.DISPATCHORDERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrder.dispatchOrders</code> attribute. 
	 * @param value the dispatchOrders
	 */
	public void setDispatchOrders(final AbstractOrder item, final CMSSite value)
	{
		setDispatchOrders( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return NagaccCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.orders</code> attribute.
	 * @return the orders
	 */
	public Set<AbstractOrder> getOrders(final SessionContext ctx, final CMSSite item)
	{
		return (Set<AbstractOrder>)CMSSITETOORDERORDERSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.orders</code> attribute.
	 * @return the orders
	 */
	public Set<AbstractOrder> getOrders(final CMSSite item)
	{
		return getOrders( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSSite.orders</code> attribute. 
	 * @param value the orders
	 */
	public void setOrders(final SessionContext ctx, final CMSSite item, final Set<AbstractOrder> value)
	{
		CMSSITETOORDERORDERSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSSite.orders</code> attribute. 
	 * @param value the orders
	 */
	public void setOrders(final CMSSite item, final Set<AbstractOrder> value)
	{
		setOrders( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to orders. 
	 * @param value the item to add to orders
	 */
	public void addToOrders(final SessionContext ctx, final CMSSite item, final AbstractOrder value)
	{
		CMSSITETOORDERORDERSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to orders. 
	 * @param value the item to add to orders
	 */
	public void addToOrders(final CMSSite item, final AbstractOrder value)
	{
		addToOrders( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from orders. 
	 * @param value the item to remove from orders
	 */
	public void removeFromOrders(final SessionContext ctx, final CMSSite item, final AbstractOrder value)
	{
		CMSSITETOORDERORDERSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from orders. 
	 * @param value the item to remove from orders
	 */
	public void removeFromOrders(final CMSSite item, final AbstractOrder value)
	{
		removeFromOrders( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.products</code> attribute.
	 * @return the products
	 */
	public Set<Seller> getProducts(final SessionContext ctx, final Product item)
	{
		final List<Seller> items = item.getLinkedItems( 
			ctx,
			true,
			NagaccCoreConstants.Relations.SELLERTOPRODUCT,
			"Seller",
			null,
			false,
			false
		);
		return new LinkedHashSet<Seller>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.products</code> attribute.
	 * @return the products
	 */
	public Set<Seller> getProducts(final Product item)
	{
		return getProducts( getSession().getSessionContext(), item );
	}
	
	public long getProductsCount(final SessionContext ctx, final Product item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			NagaccCoreConstants.Relations.SELLERTOPRODUCT,
			"Seller",
			null
		);
	}
	
	public long getProductsCount(final Product item)
	{
		return getProductsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final SessionContext ctx, final Product item, final Set<Seller> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			NagaccCoreConstants.Relations.SELLERTOPRODUCT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SELLERTOPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final Product item, final Set<Seller> value)
	{
		setProducts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final SessionContext ctx, final Product item, final Seller value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			NagaccCoreConstants.Relations.SELLERTOPRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SELLERTOPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final Product item, final Seller value)
	{
		addToProducts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final SessionContext ctx, final Product item, final Seller value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			NagaccCoreConstants.Relations.SELLERTOPRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SELLERTOPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final Product item, final Seller value)
	{
		removeFromProducts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.sellerInfo</code> attribute.
	 * @return the sellerInfo
	 */
	public Seller getSellerInfo(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (Seller)item.getProperty( ctx, NagaccCoreConstants.Attributes.AbstractOrderEntry.SELLERINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.sellerInfo</code> attribute.
	 * @return the sellerInfo
	 */
	public Seller getSellerInfo(final AbstractOrderEntry item)
	{
		return getSellerInfo( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.sellerInfo</code> attribute. 
	 * @param value the sellerInfo
	 */
	public void setSellerInfo(final SessionContext ctx, final AbstractOrderEntry item, final Seller value)
	{
		item.setProperty(ctx, NagaccCoreConstants.Attributes.AbstractOrderEntry.SELLERINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.sellerInfo</code> attribute. 
	 * @param value the sellerInfo
	 */
	public void setSellerInfo(final AbstractOrderEntry item, final Seller value)
	{
		setSellerInfo( getSession().getSessionContext(), item, value );
	}
	
}
