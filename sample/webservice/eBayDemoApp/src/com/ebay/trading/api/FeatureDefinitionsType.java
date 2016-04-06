// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * A container node for definitions of the features specified in FeatureID in the
 * GetCategoryFeatures request. If no feature ID was specified, all definitions are
 * returned.
 */
public class FeatureDefinitionsType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "ListingDurations")
    @Order(value = 0)
    public ListingDurationDefinitionsType listingDurations;

    @Element(name = "ShippingTermsRequired")
    @Order(value = 1)
    public ShippingTermRequiredDefinitionType shippingTermsRequired;

    @Element(name = "BestOfferEnabled")
    @Order(value = 2)
    public BestOfferEnabledDefinitionType bestOfferEnabled;

    @Element(name = "DutchBINEnabled")
    @Order(value = 3)
    public DutchBINEnabledDefinitionType dutchBINEnabled;

    @Element(name = "UserConsentRequired")
    @Order(value = 4)
    public UserConsentRequiredDefinitionType userConsentRequired;

    @Element(name = "HomePageFeaturedEnabled")
    @Order(value = 5)
    public HomePageFeaturedEnabledDefinitionType homePageFeaturedEnabled;

    @Element(name = "ProPackEnabled")
    @Order(value = 6)
    public ProPackEnabledDefinitionType proPackEnabled;

    @Element(name = "BasicUpgradePackEnabled")
    @Order(value = 7)
    public BasicUpgradePackEnabledDefinitionType basicUpgradePackEnabled;

    @Element(name = "ValuePackEnabled")
    @Order(value = 8)
    public ValuePackEnabledDefinitionType valuePackEnabled;

    @Element(name = "ProPackPlusEnabled")
    @Order(value = 9)
    public ProPackPlusEnabledDefinitionType proPackPlusEnabled;

    @Element(name = "AdFormatEnabled")
    @Order(value = 10)
    public AdFormatEnabledDefinitionType adFormatEnabled;

    @Element(name = "BestOfferCounterEnabled")
    @Order(value = 11)
    public BestOfferCounterEnabledDefinitionType bestOfferCounterEnabled;

    @Element(name = "BestOfferAutoDeclineEnabled")
    @Order(value = 12)
    public BestOfferAutoDeclineEnabledDefinitionType bestOfferAutoDeclineEnabled;

    @Element(name = "LocalMarketSpecialitySubscription")
    @Order(value = 13)
    public LocalMarketSpecialitySubscriptionDefinitionType localMarketSpecialitySubscription;

    @Element(name = "LocalMarketRegularSubscription")
    @Order(value = 14)
    public LocalMarketRegularSubscriptionDefinitionType localMarketRegularSubscription;

    @Element(name = "LocalMarketPremiumSubscription")
    @Order(value = 15)
    public LocalMarketPremiumSubscriptionDefinitionType localMarketPremiumSubscription;

    @Element(name = "LocalMarketNonSubscription")
    @Order(value = 16)
    public LocalMarketNonSubscriptionDefinitionType localMarketNonSubscription;

    @Element(name = "ExpressEnabled")
    @Order(value = 17)
    public ExpressEnabledDefinitionType expressEnabled;

    @Element(name = "ExpressPicturesRequired")
    @Order(value = 18)
    public ExpressPicturesRequiredDefinitionType expressPicturesRequired;

    @Element(name = "ExpressConditionRequired")
    @Order(value = 19)
    public ExpressConditionRequiredDefinitionType expressConditionRequired;

    @Element(name = "MinimumReservePrice")
    @Order(value = 20)
    public MinimumReservePriceDefinitionType minimumReservePrice;

    @Element(name = "TransactionConfirmationRequestEnabled")
    @Order(value = 21)
    public TCREnabledDefinitionType transactionConfirmationRequestEnabled;

    @Element(name = "SellerContactDetailsEnabled")
    @Order(value = 22)
    public SellerContactDetailsEnabledDefinitionType sellerContactDetailsEnabled;

    @Element(name = "StoreInventoryEnabled")
    @Order(value = 23)
    public StoreInventoryEnabledDefinitionType storeInventoryEnabled;

    @Element(name = "SkypeMeTransactionalEnabled")
    @Order(value = 24)
    public SkypeMeTransactionalEnabledDefinitionType skypeMeTransactionalEnabled;

    @Element(name = "SkypeMeNonTransactionalEnabled")
    @Order(value = 25)
    public SkypeMeNonTransactionalEnabledDefinitionType skypeMeNonTransactionalEnabled;

    @Element(name = "LocalListingDistancesRegular")
    @Order(value = 26)
    public LocalListingDistancesRegularDefinitionType localListingDistancesRegular;

    @Element(name = "LocalListingDistancesSpecialty")
    @Order(value = 27)
    public LocalListingDistancesSpecialtyDefinitionType localListingDistancesSpecialty;

    @Element(name = "LocalListingDistancesNonSubscription")
    @Order(value = 28)
    public LocalListingDistancesNonSubscriptionDefinitionType localListingDistancesNonSubscription;

    @Element(name = "ClassifiedAdPaymentMethodEnabled")
    @Order(value = 29)
    public ClassifiedAdPaymentMethodEnabledDefinitionType classifiedAdPaymentMethodEnabled;

    @Element(name = "ClassifiedAdShippingMethodEnabled")
    @Order(value = 30)
    public ClassifiedAdShippingMethodEnabledDefinitionType classifiedAdShippingMethodEnabled;

    @Element(name = "ClassifiedAdBestOfferEnabled")
    @Order(value = 31)
    public ClassifiedAdBestOfferEnabledDefinitionType classifiedAdBestOfferEnabled;

    @Element(name = "ClassifiedAdCounterOfferEnabled")
    @Order(value = 32)
    public ClassifiedAdCounterOfferEnabledDefinitionType classifiedAdCounterOfferEnabled;

    @Element(name = "ClassifiedAdAutoDeclineEnabled")
    @Order(value = 33)
    public ClassifiedAdAutoDeclineEnabledDefinitionType classifiedAdAutoDeclineEnabled;

    @Element(name = "ClassifiedAdContactByPhoneEnabled")
    @Order(value = 34)
    public ClassifiedAdContactByPhoneEnabledDefinitionType classifiedAdContactByPhoneEnabled;

    @Element(name = "ClassifiedAdContactByEmailEnabled")
    @Order(value = 35)
    public ClassifiedAdContactByEmailEnabledDefintionType classifiedAdContactByEmailEnabled;

    @Element(name = "SafePaymentRequired")
    @Order(value = 36)
    public SafePaymentRequiredDefinitionType safePaymentRequired;

    @Element(name = "ClassifiedAdPayPerLeadEnabled")
    @Order(value = 37)
    public ClassifiedAdPayPerLeadEnabledDefinitionType classifiedAdPayPerLeadEnabled;

    @Element(name = "ItemSpecificsEnabled")
    @Order(value = 38)
    public ItemSpecificsEnabledDefinitionType itemSpecificsEnabled;

    @Element(name = "PaisaPayFullEscrowEnabled")
    @Order(value = 39)
    public PaisaPayFullEscrowEnabledDefinitionType paisaPayFullEscrowEnabled;

    @Element(name = "ISBNIdentifierEnabled")
    @Order(value = 40)
    public ISBNIdentifierEnabledDefinitionType isbnIdentifierEnabled;

    @Element(name = "UPCIdentifierEnabled")
    @Order(value = 41)
    public UPCIdentifierEnabledDefinitionType upcIdentifierEnabled;

    @Element(name = "EANIdentifierEnabled")
    @Order(value = 42)
    public EANIdentifierEnabledDefinitionType eanIdentifierEnabled;

    @Element(name = "BrandMPNIdentifierEnabled")
    @Order(value = 43)
    public BrandMPNIdentifierEnabledDefinitionType brandMPNIdentifierEnabled;

    @Element(name = "BestOfferAutoAcceptEnabled")
    @Order(value = 44)
    public BestOfferAutoAcceptEnabledDefinitionType bestOfferAutoAcceptEnabled;

    @Element(name = "ClassifiedAdAutoAcceptEnabled")
    @Order(value = 45)
    public ClassifiedAdAutoAcceptEnabledDefinitionType classifiedAdAutoAcceptEnabled;

    @Element(name = "CrossBorderTradeNorthAmericaEnabled")
    @Order(value = 46)
    public CrossBorderTradeNorthAmericaEnabledDefinitionType crossBorderTradeNorthAmericaEnabled;

    @Element(name = "CrossBorderTradeGBEnabled")
    @Order(value = 47)
    public CrossBorderTradeGBEnabledDefinitionType crossBorderTradeGBEnabled;

    @Element(name = "CrossBorderTradeAustraliaEnabled")
    @Order(value = 48)
    public CrossBorderTradeAustraliaEnabledDefinitionType crossBorderTradeAustraliaEnabled;

    @Element(name = "PayPalBuyerProtectionEnabled")
    @Order(value = 49)
    public PayPalBuyerProtectionEnabledDefinitionType payPalBuyerProtectionEnabled;

    @Element(name = "BuyerGuaranteeEnabled")
    @Order(value = 50)
    public BuyerGuaranteeEnabledDefinitionType buyerGuaranteeEnabled;

    @Element(name = "CombinedFixedPriceTreatmentEnabled")
    @Order(value = 51)
    public CombinedFixedPriceTreatmentEnabledDefinitionType combinedFixedPriceTreatmentEnabled;

    @Element(name = "GalleryFeaturedDurations")
    @Order(value = 52)
    public ListingEnhancementDurationDefinitionType galleryFeaturedDurations;

    @Element(name = "INEscrowWorkflowTimeline")
    @Order(value = 53)
    public INEscrowWorkflowTimelineDefinitionType inEscrowWorkflowTimeline;

    @Element(name = "PayPalRequired")
    @Order(value = 54)
    public PayPalRequiredDefinitionType payPalRequired;

    @Element
    @Order(value = 55)
    public EBayMotorsProAdFormatEnabledDefinitionType eBayMotorsProAdFormatEnabled;

    @Element
    @Order(value = 56)
    public EBayMotorsProContactByPhoneEnabledDefinitionType eBayMotorsProContactByPhoneEnabled;

    @Element
    @Order(value = 57)
    public EBayMotorsProPhoneCountDefinitionType eBayMotorsProPhoneCount;

    @Element
    @Order(value = 58)
    public EBayMotorsProContactByAddressEnabledDefinitionType eBayMotorsProContactByAddressEnabled;

    @Element
    @Order(value = 59)
    public EBayMotorsProStreetCountDefinitionType eBayMotorsProStreetCount;

    @Element
    @Order(value = 60)
    public EBayMotorsProCompanyNameEnabledDefinitionType eBayMotorsProCompanyNameEnabled;

    @Element
    @Order(value = 61)
    public EBayMotorsProContactByEmailEnabledDefinitionType eBayMotorsProContactByEmailEnabled;

    @Element
    @Order(value = 62)
    public EBayMotorsProBestOfferEnabledDefinitionType eBayMotorsProBestOfferEnabled;

    @Element
    @Order(value = 63)
    public EBayMotorsProAutoAcceptEnabledDefinitionType eBayMotorsProAutoAcceptEnabled;

    @Element
    @Order(value = 64)
    public EBayMotorsProAutoDeclineEnabledDefinitionType eBayMotorsProAutoDeclineEnabled;

    @Element
    @Order(value = 65)
    public EBayMotorsProPaymentMethodCheckOutEnabledDefinitionType eBayMotorsProPaymentMethodCheckOutEnabled;

    @Element
    @Order(value = 66)
    public EBayMotorsProShippingMethodEnabledDefinitionType eBayMotorsProShippingMethodEnabled;

    @Element
    @Order(value = 67)
    public EBayMotorsProCounterOfferEnabledDefinitionType eBayMotorsProCounterOfferEnabled;

    @Element
    @Order(value = 68)
    public EBayMotorsProSellerContactDetailsEnabledDefinitionType eBayMotorsProSellerContactDetailsEnabled;

    @Element(name = "LocalMarketAdFormatEnabled")
    @Order(value = 69)
    public LocalMarketAdFormatEnabledDefinitionType localMarketAdFormatEnabled;

    @Element(name = "LocalMarketContactByPhoneEnabled")
    @Order(value = 70)
    public LocalMarketContactByPhoneEnabledDefinitionType localMarketContactByPhoneEnabled;

    @Element(name = "LocalMarketPhoneCount")
    @Order(value = 71)
    public LocalMarketPhoneCountDefinitionType localMarketPhoneCount;

    @Element(name = "LocalMarketContactByAddressEnabled")
    @Order(value = 72)
    public LocalMarketContactByAddressEnabledDefinitionType localMarketContactByAddressEnabled;

    @Element(name = "LocalMarketStreetCount")
    @Order(value = 73)
    public LocalMarketStreetCountDefinitionType localMarketStreetCount;

    @Element(name = "LocalMarketCompanyNameEnabled")
    @Order(value = 74)
    public LocalMarketCompanyNameEnabledDefinitionType localMarketCompanyNameEnabled;

    @Element(name = "LocalMarketContactByEmailEnabled")
    @Order(value = 75)
    public LocalMarketContactByEmailEnabledDefinitionType localMarketContactByEmailEnabled;

    @Element(name = "LocalMarketBestOfferEnabled")
    @Order(value = 76)
    public LocalMarketBestOfferEnabledDefinitionType localMarketBestOfferEnabled;

    @Element(name = "LocalMarketAutoAcceptEnabled")
    @Order(value = 77)
    public LocalMarketAutoAcceptEnabledDefinitionType localMarketAutoAcceptEnabled;

    @Element(name = "LocalMarketAutoDeclineEnabled")
    @Order(value = 78)
    public LocalMarketAutoDeclineEnabledDefinitionType localMarketAutoDeclineEnabled;

    @Element(name = "LocalMarketPaymentMethodCheckOutEnabled")
    @Order(value = 79)
    public LocalMarketPaymentMethodCheckOutEnabledDefinitionType localMarketPaymentMethodCheckOutEnabled;

    @Element(name = "LocalMarketShippingMethodEnabled")
    @Order(value = 80)
    public LocalMarketShippingMethodEnabledDefinitionType localMarketShippingMethodEnabled;

    @Element(name = "LocalMarketCounterOfferEnabled")
    @Order(value = 81)
    public LocalMarketCounterOfferEnabledDefinitionType localMarketCounterOfferEnabled;

    @Element(name = "LocalMarketSellerContactDetailsEnabled")
    @Order(value = 82)
    public LocalMarketSellerContactDetailsEnabledDefinitionType localMarketSellerContactDetailsEnabled;

    @Element(name = "ClassifiedAdPhoneCount")
    @Order(value = 83)
    public ClassifiedAdPhoneCountDefinitionType classifiedAdPhoneCount;

    @Element(name = "ClassifiedAdContactByAddressEnabled")
    @Order(value = 84)
    public ClassifiedAdContactByAddressEnabledDefinitionType classifiedAdContactByAddressEnabled;

    @Element(name = "ClassifiedAdStreetCount")
    @Order(value = 85)
    public ClassifiedAdStreetCountDefinitionType classifiedAdStreetCount;

    @Element(name = "ClassifiedAdCompanyNameEnabled")
    @Order(value = 86)
    public ClassifiedAdCompanyNameEnabledDefinitionType classifiedAdCompanyNameEnabled;

    @Element(name = "SpecialitySubscription")
    @Order(value = 87)
    public SpecialitySubscriptionDefinitionType specialitySubscription;

    @Element(name = "RegularSubscription")
    @Order(value = 88)
    public RegularSubscriptionDefinitionType regularSubscription;

    @Element(name = "PremiumSubscription")
    @Order(value = 89)
    public PremiumSubscriptionDefinitionType premiumSubscription;

    @Element(name = "NonSubscription")
    @Order(value = 90)
    public NonSubscriptionDefinitionType nonSubscription;

    @Element(name = "ReturnPolicyEnabled")
    @Order(value = 91)
    public ReturnPolicyEnabledDefinitionType returnPolicyEnabled;

    @Element(name = "HandlingTimeEnabled")
    @Order(value = 92)
    public HandlingTimeEnabledDefinitionType handlingTimeEnabled;

    @Element(name = "PayPalRequiredForStoreOwner")
    @Order(value = 93)
    public PayPalRequiredForStoreOwnerDefinitionType payPalRequiredForStoreOwner;

    @Element(name = "ReviseQuantityAllowed")
    @Order(value = 94)
    public ReviseQuantityAllowedDefinitionType reviseQuantityAllowed;

    @Element(name = "RevisePriceAllowed")
    @Order(value = 95)
    public RevisePriceAllowedDefinitionType revisePriceAllowed;

    @Element(name = "StoreOwnerExtendedListingDurationsEnabled")
    @Order(value = 96)
    public StoreOwnerExtendedListingDurationsEnabledDefinitionType storeOwnerExtendedListingDurationsEnabled;

    @Element(name = "StoreOwnerExtendedListingDurations")
    @Order(value = 97)
    public StoreOwnerExtendedListingDurationsDefinitionType storeOwnerExtendedListingDurations;

    @Element(name = "PaymentMethod")
    @Order(value = 98)
    public PaymentMethodDefinitionType paymentMethod;

    @Element(name = "Group1MaxFlatShippingCost")
    @Order(value = 99)
    public Group1MaxFlatShippingCostDefinitionType group1MaxFlatShippingCost;

    @Element(name = "Group2MaxFlatShippingCost")
    @Order(value = 100)
    public Group2MaxFlatShippingCostDefinitionType group2MaxFlatShippingCost;

    @Element(name = "Group3MaxFlatShippingCost")
    @Order(value = 101)
    public Group3MaxFlatShippingCostDefinitionType group3MaxFlatShippingCost;

    @Element(name = "MaxFlatShippingCostCBTExempt")
    @Order(value = 102)
    public MaxFlatShippingCostCBTExemptDefinitionType maxFlatShippingCostCBTExempt;

    @Element(name = "MaxFlatShippingCost")
    @Order(value = 103)
    public MaxFlatShippingCostDefinitionType maxFlatShippingCost;

    @Element(name = "VariationsEnabled")
    @Order(value = 104)
    public VariationsEnabledDefinitionType variationsEnabled;

    @Element(name = "AttributeConversionEnabled")
    @Order(value = 105)
    public AttributeConversionEnabledFeatureDefinitionType attributeConversionEnabled;

    @Element(name = "FreeGalleryPlusEnabled")
    @Order(value = 106)
    public FreeGalleryPlusEnabledDefinitionType freeGalleryPlusEnabled;

    @Element(name = "FreePicturePackEnabled")
    @Order(value = 107)
    public FreePicturePackEnabledDefinitionType freePicturePackEnabled;

    @Element(name = "ItemCompatibilityEnabled")
    @Order(value = 108)
    public ItemCompatibilityEnabledDefinitionType itemCompatibilityEnabled;

    @Element(name = "MaxItemCompatibility")
    @Order(value = 109)
    public MaxItemCompatibilityDefinitionType maxItemCompatibility;

    @Element(name = "MinItemCompatibility")
    @Order(value = 110)
    public MinItemCompatibilityDefinitionType minItemCompatibility;

    @Element(name = "ConditionEnabled")
    @Order(value = 111)
    public ConditionEnabledDefinitionType conditionEnabled;

    @Element(name = "ConditionValues")
    @Order(value = 112)
    public ConditionValuesDefinitionType conditionValues;

    @Element(name = "ValueCategory")
    @Order(value = 113)
    public ValueCategoryDefinitionType valueCategory;

    @Element(name = "ProductCreationEnabled")
    @Order(value = 114)
    public ProductCreationEnabledDefinitionType productCreationEnabled;

    @Element(name = "CompatibleVehicleType")
    @Order(value = 115)
    public CompatibleVehicleTypeDefinitionType compatibleVehicleType;

    @Element(name = "MaxGranularFitmentCount")
    @Order(value = 116)
    public MaxGranularFitmentCountDefinitionType maxGranularFitmentCount;

    @Element(name = "PaymentOptionsGroup")
    @Order(value = 117)
    public PaymentOptionsGroupEnabledDefinitionType paymentOptionsGroup;

    @Element(name = "ShippingProfileCategoryGroup")
    @Order(value = 118)
    public ProfileCategoryGroupDefinitionType shippingProfileCategoryGroup;

    @Element(name = "PaymentProfileCategoryGroup")
    @Order(value = 119)
    public ProfileCategoryGroupDefinitionType paymentProfileCategoryGroup;

    @Element(name = "ReturnPolicyProfileCategoryGroup")
    @Order(value = 120)
    public ProfileCategoryGroupDefinitionType returnPolicyProfileCategoryGroup;

    @Element(name = "VINSupported")
    @Order(value = 121)
    public VINSupportedDefinitionType vinSupported;

    @Element(name = "VRMSupported")
    @Order(value = 122)
    public VRMSupportedDefinitionType vrmSupported;

    @Element(name = "SellerProvidedTitleSupported")
    @Order(value = 123)
    public SellerProvidedTitleSupportedDefinitionType sellerProvidedTitleSupported;

    @Element(name = "DepositSupported")
    @Order(value = 124)
    public DepositSupportedDefinitionType depositSupported;

    @Element(name = "GlobalShippingEnabled")
    @Order(value = 125)
    public GlobalShippingEnabledDefinitionType globalShippingEnabled;

    @AnyElement
    @Order(value = 126)
    public List<Object> any;


}