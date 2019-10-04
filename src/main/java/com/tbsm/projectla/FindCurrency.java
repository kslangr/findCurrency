package com.tbsm.projectla;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import com.tbsm.projectla.models.Currency;

public class FindCurrency {
	private Map<String, String> foundStuff;
	//private NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
	
	private String generalDetailsBaseLeaseRate; // Base Lease Rate
	
	private String rentSchedulesCostPerUnit; // Cost Per Unit
	private String rentSchedulesExpectedCashPreTax; // Expected Cash Pre Tax
	private String rentSchedulesTotalTax; // Total Tax
	private String rentSchedulesExpectedCashTotal; // Expected Cash Total
	private String rentSalesReportingDetailsBaseSalesFrom; // Base Sales From
	private String rentSalesReportingDetailsBaseSalesTo; // Base Sales To
	private String rentSalesExclusionsCapAmount; // Cap Amount
	private String rentAllowableDeductionsCapAmount; // Cap Amount
	private String rentPercentRentSchedulesCostPerUnit; // Cost Per Unit
	private String rentPercentRentSchedulesExpectedCashAmount; // Expected Cash Amount
	private String rentPercentRentSchedulesTotalTaxAmount; // Total Tax Amount
	private String rentPercentRentSchedulesTotalCashWithTax; // Total Cash With Tax
	private String rentCommissionDetailsExpectedAmount; // Expected Amount
	private String rentCommissionDetailsAmountDue; // Amount Due
	private String rentCommissionSchedulesCostPerUnit; // Cost Per Unit
	private String rentCommissionSchedulesExpectedCashAmount; // Expected Cash Amount
	private String rentCommissionSchedulesTotalTaxAmount; // Total Tax Amount
	private String rentCommissionSchedulesTotalCashWithTax; // Total Cash With Tax
	
	private String securityDepositDepositDetailsDepositAmount; // 313
	private String securityDepositDepositDetailsExpectedReturnedAmount; // 314
	private String securityDepositDepositDetailsAccountBalance; // 319
	private String securityDepositDepositDetailsRequiredAmount; // 321
	
	private String optionsTenantRenewalAndOtherOptionsRenewalRate; // 338 Renewal Rate
	private String optionsTenantRenewalAndOtherOptionsPurchasePrice; // 339 Purchase Price
	private String optionsTenantRenewalAndOtherOptionsPenalty; // 340 Penalty
	
	private String rightsAlterationsAlterationsThresholdAmountIfAny; // 355 Threshold Amount, if any?
	private String rightsHoldoverHoldoverRentPenaltyAmount; // 381 Rent Penalty - Amount
	private String rightsOtherRightsCovenantAmount; // 394 Covenant Amount
	
	private String allowancesImprovementClauseDetailsAllowanceAmount; // 442 Allowance Amount
	private String allowancesImprovementClauseDetailsPerArea; // 443 Per Area	
	private String allowancesImprovementClauseDetailsAllowanceRequested; // 445 Allowance Requested
	private String allowancesImprovementClauseDetailsAmountReceived; // 448 Amount Received
	private String allowancesImprovementClauseDetailsAllowanceRemaining; // 449 Allowance Remaining	
	
	private String opexcamCamAuditSetupBaseCost; // 473 Base Cost/Sq ft,
	private String opexcamCamAuditSetupBaseYearCapAmount; // 475 Base Year Cap Amount
	private String opexcamServicesIncludedEstimatedCost; // 496 Estimated Cost
	private String opexcamServicesIncludedProportionateSharePercent; // 497 Proportionate Share %
	private String opexcamServicesIncludedServiceCapAmount; // 499 Service CAP Amount (zero is no cap)
	private String opexcamCamSchedulesCostPerUnit; // 506 Cost Per Unit
	private String opexcamCamSchedulesExpectedCashAmount; // 509 Expected Cash Amount
	private String opexcamCamSchedulesTotalTaxAmount; // 510 Total Tax Amount
	private String opexcamCamSchedulesTotalCashWithTax; // 511 Total Cash With Tax
	
	private String insuranceInsuranceClauseDetailsAggregateCoverageAmount; // 529 Aggregate Coverage Amount
	private String insuranceInsuranceClauseDetailsUmbrellaExcess; // 531 Umbrella Excess
	private String insuranceInsuranceClauseDetailsAutoLiability; // 532 Auto Liability	
	private String insuranceInsuranceClauseDetailsWorkersComp; // 533 Workers Comp
	private String insuranceInsuranceClauseDetailsOtherCoverage; // 534 Other Coverage	
	private String insuranceInsuranceClauseDetailsSelfInsuranceAmount; // 536 Self Insurance Amount
	private String insuranceInsuranceSchedulesCostPerUnit; // 545 Cost Per Unit
	private String insuranceInsuranceSchedulesExpectedCashAmount; // 548 Expected Cash Amount
	private String insuranceInsuranceSchedulesTotalTaxAmount; // 549 Total Tax Amount
	private String insuranceInsuranceSchedulesTotalCashWithTax; // 550 Total Cash With Tax
	
	private String taxSchedulesCostPerUnit; // 578 Cost Per Unit
	private String taxSchedulesExpectedCashAmount; // 581 Expected Cash Amount
	private String taxSchedulesTotalTaxAmount; // 582 Total Tax Amount
	private String taxSchedulesTotalCashWithTax; // 583 Total Cash With Tax
	
	private String parkingSpaceTypesRate; // 597 Rate
	
	private String coTenancyDetailsPlusPercentOfGla; // 605 Plus % of GLA
	private String coTenancyDetailsRentReductionAmount; // 606 Rent Reduction Amount
	private String coTenancyItemRentReductionTo; // 617 Rent Reduction To
	private String coTenancyItemCoTenancyAmount; // 619 Co-Tenancy Amount
	
	private String responsibilitiesResponsibilityServiceCapAmount; // 665 Cap Amount
	private String responsibilitiesResponsibilityServiceMinimumResponsibilityAmount; // 668 Minimum Responsibility Amount
	private String responsibilitiesResponsibilityServiceMaximumCostPer; // 669 Maximum Cost Per	
	
	private String otherClausesAmount; // 680 Amount
	
	private String accountingInitialDirectCosts; // 691 Initial Direct Costs
	private String accountingFasb13TreatmentFairMarketValue; // 709 Fair Market Value

	
	public FindCurrency(Map<String, String> foundStuff) {
		this.foundStuff = foundStuff;
	}
	
	
	public Currency processCurrencies() {		
		Currency currency = new Currency();

		currency.setGeneralDetailsBaseLeaseRate( search( generalDetailsBaseLeaseRate ) ); // Base Lease Rate
		currency.setRentSchedulesCostPerUnit( search( rentSchedulesCostPerUnit ) ); // Cost Per Unit
		currency.setRentSchedulesExpectedCashPreTax( search( rentSchedulesExpectedCashPreTax ) ); // Expected Cash Pre Tax
		currency.setRentSchedulesTotalTax( search( rentSchedulesTotalTax ) ); // Total Tax
		currency.setRentSchedulesExpectedCashTotal( search( rentSchedulesExpectedCashTotal ) ); // Expected Cash Total
		currency.setRentSalesReportingDetailsBaseSalesFrom( search( rentSalesReportingDetailsBaseSalesFrom ) ); // Base Sales From
		currency.setRentSalesReportingDetailsBaseSalesTo( search( rentSalesReportingDetailsBaseSalesTo ) ); // Base Sales To
		currency.setRentSalesExclusionsCapAmount( search( rentSalesExclusionsCapAmount ) ); // Cap Amount
		currency.setRentAllowableDeductionsCapAmount( search( rentAllowableDeductionsCapAmount ) ); // Cap Amount
		currency.setRentPercentRentSchedulesCostPerUnit( search( rentPercentRentSchedulesCostPerUnit ) ); // Cost Per Unit
		currency.setRentPercentRentSchedulesExpectedCashAmount( search( rentPercentRentSchedulesExpectedCashAmount ) ); // Expected Cash Amount
		currency.setRentPercentRentSchedulesExpectedCashAmount( search( rentPercentRentSchedulesTotalTaxAmount ) ); // Total Tax Amount
		currency.setRentPercentRentSchedulesTotalCashWithTax( search( rentPercentRentSchedulesTotalCashWithTax ) ); // Total Cash With Tax
		currency.setRentCommissionDetailsExpectedAmount( search( rentCommissionDetailsExpectedAmount ) ); // Expected Amount
		currency.setRentCommissionDetailsAmountDue( search( rentCommissionDetailsAmountDue ) ); // Amount Due
		currency.setRentCommissionSchedulesCostPerUnit( search( rentCommissionSchedulesCostPerUnit ) ); // Cost Per Unit
		currency.setRentCommissionSchedulesExpectedCashAmount( search( rentCommissionSchedulesExpectedCashAmount ) ); // Expected Cash Amount
		currency.setRentCommissionSchedulesTotalTaxAmount( search( rentCommissionSchedulesTotalTaxAmount ) ); // Total Tax Amount
		currency.setRentCommissionSchedulesTotalCashWithTax( search( rentCommissionSchedulesTotalCashWithTax ) ); // Total Cash With Tax
		
		currency.setSecurityDepositDepositDetailsDepositAmount( search( securityDepositDepositDetailsDepositAmount ) ); // 313
		currency.setSecurityDepositDepositDetailsExpectedReturnedAmount( search( securityDepositDepositDetailsExpectedReturnedAmount ) ); // 314
		currency.setSecurityDepositDepositDetailsAccountBalance( search( securityDepositDepositDetailsAccountBalance ) ); // 319
		currency.setSecurityDepositDepositDetailsRequiredAmount( search( securityDepositDepositDetailsRequiredAmount ) ); // 321
		
		currency.setOptionsTenantRenewalAndOtherOptionsRenewalRate( search( optionsTenantRenewalAndOtherOptionsRenewalRate ) ); // 338 Renewal Rate
		currency.setOptionsTenantRenewalAndOtherOptionsPurchasePrice( search( optionsTenantRenewalAndOtherOptionsPurchasePrice ) ); // 339 Purchase Price
		currency.setOptionsTenantRenewalAndOtherOptionsPenalty( search( optionsTenantRenewalAndOtherOptionsPenalty ) ); // 340 Penalty
		
		currency.setOptionsTenantRenewalAndOtherOptionsPenalty( search( rightsAlterationsAlterationsThresholdAmountIfAny ) ); // 355 Threshold Amount, if any?
		currency.setRightsHoldoverHoldoverRentPenaltyAmount( search( rightsHoldoverHoldoverRentPenaltyAmount ) ); // 381 Rent Penalty - Amount
		currency.setRightsOtherRightsCovenantAmount( search( rightsOtherRightsCovenantAmount ) ); // 394 Covenant Amount
		
		currency.setAllowancesImprovementClauseDetailsAllowanceAmount( search( allowancesImprovementClauseDetailsAllowanceAmount ) ); // 442 Allowance Amount
		currency.setAllowancesImprovementClauseDetailsPerArea( search( allowancesImprovementClauseDetailsPerArea ) ); // 443 Per Area	
		currency.setAllowancesImprovementClauseDetailsAllowanceRequested( search( allowancesImprovementClauseDetailsAllowanceRequested ) ); // 445 Allowance Requested
		currency.setAllowancesImprovementClauseDetailsAmountReceived( search( allowancesImprovementClauseDetailsAmountReceived ) ); // 448 Amount Received
		currency.setAllowancesImprovementClauseDetailsAllowanceRemaining( search( allowancesImprovementClauseDetailsAllowanceRemaining ) ); // 449 Allowance Remaining	
		
		currency.setOpexcamCamAuditSetupBaseCost( search( opexcamCamAuditSetupBaseCost ) ); // 473 Base Cost/Sq ft,
		currency.setOpexcamCamAuditSetupBaseYearCapAmount( search( opexcamCamAuditSetupBaseYearCapAmount ) ); // 475 Base Year Cap Amount
		currency.setOpexcamServicesIncludedEstimatedCost( search( opexcamServicesIncludedEstimatedCost ) ); // 496 Estimated Cost
		currency.setOpexcamServicesIncludedProportionateSharePercent( search( opexcamServicesIncludedProportionateSharePercent ) ); // 497 Proportionate Share %
		currency.setOpexcamServicesIncludedServiceCapAmount( search( opexcamServicesIncludedServiceCapAmount ) ); // 499 Service CAP Amount (zero is no cap)
		currency.setOpexcamCamSchedulesCostPerUnit( search( opexcamCamSchedulesCostPerUnit ) ); // 506 Cost Per Unit
		currency.setOpexcamCamSchedulesExpectedCashAmount( search( opexcamCamSchedulesExpectedCashAmount ) ); // 509 Expected Cash Amount
		currency.setOpexcamCamSchedulesTotalTaxAmount( search( opexcamCamSchedulesTotalTaxAmount ) ); // 510 Total Tax Amount
		currency.setOpexcamCamSchedulesTotalCashWithTax( search( opexcamCamSchedulesTotalCashWithTax ) ); // 511 Total Cash With Tax
		
		currency.setInsuranceInsuranceClauseDetailsAggregateCoverageAmount( search( insuranceInsuranceClauseDetailsAggregateCoverageAmount ) ); // 529 Aggregate Coverage Amount
		currency.setInsuranceInsuranceClauseDetailsUmbrellaExcess( search( insuranceInsuranceClauseDetailsUmbrellaExcess ) ); // 531 Umbrella Excess
		currency.setInsuranceInsuranceClauseDetailsAutoLiability( search( insuranceInsuranceClauseDetailsAutoLiability ) ); // 532 Auto Liability	
		currency.setInsuranceInsuranceClauseDetailsWorkersComp( search( insuranceInsuranceClauseDetailsWorkersComp ) ); // 533 Workers Comp
		currency.setInsuranceInsuranceClauseDetailsOtherCoverage( search( insuranceInsuranceClauseDetailsOtherCoverage ) ); // 534 Other Coverage	
		currency.setInsuranceInsuranceClauseDetailsSelfInsuranceAmount( search( insuranceInsuranceClauseDetailsSelfInsuranceAmount ) ); // 536 Self Insurance Amount
		currency.setInsuranceInsuranceSchedulesCostPerUnit( search( insuranceInsuranceSchedulesCostPerUnit ) ); // 545 Cost Per Unit
		currency.setInsuranceInsuranceSchedulesExpectedCashAmount( search( insuranceInsuranceSchedulesExpectedCashAmount ) ); // 548 Expected Cash Amount
		currency.setInsuranceInsuranceSchedulesTotalTaxAmount( search( insuranceInsuranceSchedulesTotalTaxAmount ) ); // 549 Total Tax Amount
		currency.setInsuranceInsuranceSchedulesTotalCashWithTax( search( insuranceInsuranceSchedulesTotalCashWithTax ) ); // 550 Total Cash With Tax
		
		currency.setTaxSchedulesCostPerUnit( search( taxSchedulesCostPerUnit ) ); // 578 Cost Per Unit
		currency.setTaxSchedulesExpectedCashAmount( search( taxSchedulesExpectedCashAmount ) ); // 581 Expected Cash Amount
		currency.setTaxSchedulesTotalTaxAmount( search( taxSchedulesTotalTaxAmount ) ); // 582 Total Tax Amount
		currency.setTaxSchedulesTotalCashWithTax( search( taxSchedulesTotalCashWithTax ) ); // 583 Total Cash With Tax
		
		currency.setParkingSpaceTypesRate( search( parkingSpaceTypesRate ) ); // 597 Rate
		
		currency.setCoTenancyDetailsPlusPercentOfGla( search( coTenancyDetailsPlusPercentOfGla ) ); // 605 Plus % of GLA
		currency.setCoTenancyDetailsRentReductionAmount( search( coTenancyDetailsRentReductionAmount ) ); // 606 Rent Reduction Amount
		currency.setCoTenancyItemRentReductionTo( search( coTenancyItemRentReductionTo ) ); // 617 Rent Reduction To
		currency.setCoTenancyItemCoTenancyAmount( search( coTenancyItemCoTenancyAmount ) ); // 619 Co-Tenancy Amount
		
		currency.setResponsibilitiesResponsibilityServiceCapAmount( search( responsibilitiesResponsibilityServiceCapAmount ) ); // 665 Cap Amount
		currency.setResponsibilitiesResponsibilityServiceMinimumResponsibilityAmount( search( responsibilitiesResponsibilityServiceMinimumResponsibilityAmount ) ); // 668 Minimum Responsibility Amount
		currency.setResponsibilitiesResponsibilityServiceMaximumCostPer( search( responsibilitiesResponsibilityServiceMaximumCostPer ) ); // 669 Maximum Cost Per	
		
		currency.setOtherClausesAmount( search( otherClausesAmount ) ); // 680 Amount
		
		currency.setAccountingInitialDirectCosts( search( accountingInitialDirectCosts ) ); // 691 Initial Direct Costs
		currency.setAccountingFasb13TreatmentFairMarketValue( search( accountingFasb13TreatmentFairMarketValue ) ); // 709 Fair Market Value
		
		return currency;		
	}
	
	private Double search(String s) {
		if( s != null && s != "" ) {
			List<String> criteriaList = Arrays.asList(s.split(","));				
			for (String criteria : criteriaList) {
				Optional<Entry<String, String>> map = foundStuff.entrySet().stream()
			      .filter (e -> e.getValue().toLowerCase().contains( criteria.toLowerCase() )).findFirst();
				
				if(map.isPresent()) {
					return Double.valueOf( map.get().getKey() );
				}
			}
		}
		return null;		
	}
}