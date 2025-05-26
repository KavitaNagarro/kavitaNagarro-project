/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 26-May-2025, 8:12:43 am                     ---
 * ----------------------------------------------------------------
 */
package com.hybris.nagarro.core.jalo;

import com.hybris.nagarro.core.constants.NagaccCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Seller}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedSeller extends GenericItem
{
	/** Qualifier of the <code>Seller.sellerCode</code> attribute **/
	public static final String SELLERCODE = "sellerCode";
	/** Qualifier of the <code>Seller.sellerName</code> attribute **/
	public static final String SELLERNAME = "sellerName";
	/** Qualifier of the <code>Seller.leadTime</code> attribute **/
	public static final String LEADTIME = "leadTime";
	/** Qualifier of the <code>Seller.sellerBanner</code> attribute **/
	public static final String SELLERBANNER = "sellerBanner";
	/** Qualifier of the <code>Seller.sellers</code> attribute **/
	public static final String SELLERS = "sellers";
	/** Relation ordering override parameter constants for SellerToProduct from ((nagacccore))*/
	protected static String SELLERTOPRODUCT_SRC_ORDERED = "relation.SellerToProduct.source.ordered";
	protected static String SELLERTOPRODUCT_TGT_ORDERED = "relation.SellerToProduct.target.ordered";
	/** Relation disable markmodifed parameter constants for SellerToProduct from ((nagacccore))*/
	protected static String SELLERTOPRODUCT_MARKMODIFIED = "relation.SellerToProduct.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SELLERCODE, AttributeMode.INITIAL);
		tmp.put(SELLERNAME, AttributeMode.INITIAL);
		tmp.put(LEADTIME, AttributeMode.INITIAL);
		tmp.put(SELLERBANNER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Product");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(SELLERTOPRODUCT_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.leadTime</code> attribute.
	 * @return the leadTime
	 */
	public Integer getLeadTime(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, LEADTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.leadTime</code> attribute.
	 * @return the leadTime
	 */
	public Integer getLeadTime()
	{
		return getLeadTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.leadTime</code> attribute. 
	 * @return the leadTime
	 */
	public int getLeadTimeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getLeadTime( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.leadTime</code> attribute. 
	 * @return the leadTime
	 */
	public int getLeadTimeAsPrimitive()
	{
		return getLeadTimeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.leadTime</code> attribute. 
	 * @param value the leadTime
	 */
	public void setLeadTime(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, LEADTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.leadTime</code> attribute. 
	 * @param value the leadTime
	 */
	public void setLeadTime(final Integer value)
	{
		setLeadTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.leadTime</code> attribute. 
	 * @param value the leadTime
	 */
	public void setLeadTime(final SessionContext ctx, final int value)
	{
		setLeadTime( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.leadTime</code> attribute. 
	 * @param value the leadTime
	 */
	public void setLeadTime(final int value)
	{
		setLeadTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.sellerBanner</code> attribute.
	 * @return the sellerBanner
	 */
	public Media getSellerBanner(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, SELLERBANNER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.sellerBanner</code> attribute.
	 * @return the sellerBanner
	 */
	public Media getSellerBanner()
	{
		return getSellerBanner( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.sellerBanner</code> attribute. 
	 * @param value the sellerBanner
	 */
	public void setSellerBanner(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, SELLERBANNER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.sellerBanner</code> attribute. 
	 * @param value the sellerBanner
	 */
	public void setSellerBanner(final Media value)
	{
		setSellerBanner( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.sellerCode</code> attribute.
	 * @return the sellerCode
	 */
	public String getSellerCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SELLERCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.sellerCode</code> attribute.
	 * @return the sellerCode
	 */
	public String getSellerCode()
	{
		return getSellerCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.sellerCode</code> attribute. 
	 * @param value the sellerCode
	 */
	public void setSellerCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SELLERCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.sellerCode</code> attribute. 
	 * @param value the sellerCode
	 */
	public void setSellerCode(final String value)
	{
		setSellerCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.sellerName</code> attribute.
	 * @return the sellerName
	 */
	public String getSellerName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSeller.getSellerName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, SELLERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.sellerName</code> attribute.
	 * @return the sellerName
	 */
	public String getSellerName()
	{
		return getSellerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.sellerName</code> attribute. 
	 * @return the localized sellerName
	 */
	public Map<Language,String> getAllSellerName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,SELLERNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.sellerName</code> attribute. 
	 * @return the localized sellerName
	 */
	public Map<Language,String> getAllSellerName()
	{
		return getAllSellerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.sellerName</code> attribute. 
	 * @param value the sellerName
	 */
	public void setSellerName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSeller.setSellerName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, SELLERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.sellerName</code> attribute. 
	 * @param value the sellerName
	 */
	public void setSellerName(final String value)
	{
		setSellerName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.sellerName</code> attribute. 
	 * @param value the sellerName
	 */
	public void setAllSellerName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,SELLERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.sellerName</code> attribute. 
	 * @param value the sellerName
	 */
	public void setAllSellerName(final Map<Language,String> value)
	{
		setAllSellerName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.sellers</code> attribute.
	 * @return the sellers
	 */
	public Set<Product> getSellers(final SessionContext ctx)
	{
		final List<Product> items = getLinkedItems( 
			ctx,
			false,
			NagaccCoreConstants.Relations.SELLERTOPRODUCT,
			"Product",
			null,
			false,
			false
		);
		return new LinkedHashSet<Product>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Seller.sellers</code> attribute.
	 * @return the sellers
	 */
	public Set<Product> getSellers()
	{
		return getSellers( getSession().getSessionContext() );
	}
	
	public long getSellersCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			NagaccCoreConstants.Relations.SELLERTOPRODUCT,
			"Product",
			null
		);
	}
	
	public long getSellersCount()
	{
		return getSellersCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.sellers</code> attribute. 
	 * @param value the sellers
	 */
	public void setSellers(final SessionContext ctx, final Set<Product> value)
	{
		setLinkedItems( 
			ctx,
			false,
			NagaccCoreConstants.Relations.SELLERTOPRODUCT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SELLERTOPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Seller.sellers</code> attribute. 
	 * @param value the sellers
	 */
	public void setSellers(final Set<Product> value)
	{
		setSellers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sellers. 
	 * @param value the item to add to sellers
	 */
	public void addToSellers(final SessionContext ctx, final Product value)
	{
		addLinkedItems( 
			ctx,
			false,
			NagaccCoreConstants.Relations.SELLERTOPRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SELLERTOPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sellers. 
	 * @param value the item to add to sellers
	 */
	public void addToSellers(final Product value)
	{
		addToSellers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sellers. 
	 * @param value the item to remove from sellers
	 */
	public void removeFromSellers(final SessionContext ctx, final Product value)
	{
		removeLinkedItems( 
			ctx,
			false,
			NagaccCoreConstants.Relations.SELLERTOPRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SELLERTOPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sellers. 
	 * @param value the item to remove from sellers
	 */
	public void removeFromSellers(final Product value)
	{
		removeFromSellers( getSession().getSessionContext(), value );
	}
	
}
