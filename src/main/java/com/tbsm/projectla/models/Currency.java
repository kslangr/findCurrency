package com.tbsm.projectla.models;

import java.text.NumberFormat;

public class Currency {
	private NumberFormat currancyFormatter = NumberFormat.getCurrencyInstance();
	
	private Double generalDetailsBaseLeaseRate; // Base Lease Rate
	private Double rentSchedulesCostPerUnit; // Cost Per Unit
	private Double rentSchedulesExpectedCashPreTax; // Expected Cash Pre Tax
	private Double rentSchedulesTotalTax; // Total Tax
	private Double rentSchedulesExpectedCashTotal; // Expected Cash Total
	private Double rentSalesReportingDetailsBaseSalesFrom; // Base Sales From
	private Double rentSalesReportingDetailsBaseSalesTo; // Base Sales To
	private Double rentSalesExclusionsCapAmount; // Cap Amount
	private Double rentAllowableDeductionsCapAmount; // Cap Amount
	private Double rentPercentRentSchedulesCostPerUnit; // Cost Per Unit
	private Double rentPercentRentSchedulesExpectedCashAmount; // Expected Cash Amount
	private Double rentPercentRentSchedulesTotalTaxAmount; // Total Tax Amount
	private Double rentPercentRentSchedulesTotalCashWithTax; // Total Cash With Tax
	private Double rentCommissionDetailsExpectedAmount; // Expected Amount
	private Double rentCommissionDetailsAmountDue; // Amount Due
	private Double rentCommissionSchedulesCostPerUnit; // Cost Per Unit
	private Double rentCommissionSchedulesExpectedCashAmount; // Expected Cash Amount
	private Double rentCommissionSchedulesTotalTaxAmount; // Total Tax Amount
	private Double rentCommissionSchedulesTotalCashWithTax; // Total Cash With Tax
	private Double securityDepositDepositDetailsDepositAmount; // 313
	private Double securityDepositDepositDetailsExpectedReturnedAmount; // 314
	private Double securityDepositDepositDetailsAccountBalance; // 319
	private Double securityDepositDepositDetailsRequiredAmount; // 321
	private Double optionsTenantRenewalAndOtherOptionsRenewalRate; // 338 Renewal Rate
	private Double optionsTenantRenewalAndOtherOptionsPurchasePrice; // 339 Purchase Price
	private Double optionsTenantRenewalAndOtherOptionsPenalty; // 340 Penalty
	private Double rightsAlterationsAlterationsThresholdAmountIfAny; // 355 Threshold Amount, if any?
	private Double rightsHoldoverHoldoverRentPenaltyAmount; // 381 Rent Penalty - Amount
	private Double rightsOtherRightsCovenantAmount; // 394 Covenant Amount
	private Double allowancesImprovementClauseDetailsAllowanceAmount; // 442 Allowance Amount
	private Double allowancesImprovementClauseDetailsPerArea; // 443 Per Area	
	private Double allowancesImprovementClauseDetailsAllowanceRequested; // 445 Allowance Requested
	private Double allowancesImprovementClauseDetailsAmountReceived; // 448 Amount Received
	private Double allowancesImprovementClauseDetailsAllowanceRemaining; // 449 Allowance Remaining	
	private Double opexcamCamAuditSetupBaseCost; // 473 Base Cost/Sq ft,
	private Double opexcamCamAuditSetupBaseYearCapAmount; // 475 Base Year Cap Amount
	private Double opexcamServicesIncludedEstimatedCost; // 496 Estimated Cost
	private Double opexcamServicesIncludedProportionateSharePercent; // 497 Proportionate Share %
	private Double opexcamServicesIncludedServiceCapAmount; // 499 Service CAP Amount (zero is no cap)
	private Double opexcamCamSchedulesCostPerUnit; // 506 Cost Per Unit
	private Double opexcamCamSchedulesExpectedCashAmount; // 509 Expected Cash Amount
	private Double opexcamCamSchedulesTotalTaxAmount; // 510 Total Tax Amount
	private Double opexcamCamSchedulesTotalCashWithTax; // 511 Total Cash With Tax
	private Double insuranceInsuranceClauseDetailsAggregateCoverageAmount; // 529 Aggregate Coverage Amount
	private Double insuranceInsuranceClauseDetailsUmbrellaExcess; // 531 Umbrella Excess
	private Double insuranceInsuranceClauseDetailsAutoLiability; // 532 Auto Liability	
	private Double insuranceInsuranceClauseDetailsWorkersComp; // 533 Workers Comp
	private Double insuranceInsuranceClauseDetailsOtherCoverage; // 534 Other Coverage	
	private Double insuranceInsuranceClauseDetailsSelfInsuranceAmount; // 536 Self Insurance Amount
	private Double insuranceInsuranceSchedulesCostPerUnit; // 545 Cost Per Unit
	private Double insuranceInsuranceSchedulesExpectedCashAmount; // 548 Expected Cash Amount
	private Double insuranceInsuranceSchedulesTotalTaxAmount; // 549 Total Tax Amount
	private Double insuranceInsuranceSchedulesTotalCashWithTax; // 550 Total Cash With Tax
	private Double taxSchedulesCostPerUnit; // 578 Cost Per Unit
	private Double taxSchedulesExpectedCashAmount; // 581 Expected Cash Amount
	private Double taxSchedulesTotalTaxAmount; // 582 Total Tax Amount
	private Double taxSchedulesTotalCashWithTax; // 583 Total Cash With Tax
	private Double parkingSpaceTypesRate; // 597 Rate
	private Double coTenancyDetailsPlusPercentOfGla; // 605 Plus % of GLA
	private Double coTenancyDetailsRentReductionAmount; // 606 Rent Reduction Amount
	private Double coTenancyItemRentReductionTo; // 617 Rent Reduction To
	private Double coTenancyItemCoTenancyAmount; // 619 Co-Tenancy Amount
	private Double responsibilitiesResponsibilityServiceCapAmount; // 665 Cap Amount
	private Double responsibilitiesResponsibilityServiceMinimumResponsibilityAmount; // 668 Minimum Responsibility Amount
	private Double responsibilitiesResponsibilityServiceMaximumCostPer; // 669 Maximum Cost Per	
	private Double otherClausesAmount; // 680 Amount
	private Double accountingInitialDirectCosts; // 691 Initial Direct Costs
	private Double accountingFasb13TreatmentFairMarketValue; // 709 Fair Market Value


	public Currency() {
		// Default
	}


	
   /**
	 * @return the currancyFormatter
	 */
	public NumberFormat getCurrancyFormatter() {
		return currancyFormatter;
	}



	/**
	 * @param currancyFormatter the currancyFormatter to set
	 */
	public void setCurrancyFormatter(NumberFormat currancyFormatter) {
		this.currancyFormatter = currancyFormatter;
	}



	/**
	 * @return the generalDetailsBaseLeaseRate
	 */
	public Double getGeneralDetailsBaseLeaseRate() {
		return generalDetailsBaseLeaseRate;
	}



	/**
	 * @param generalDetailsBaseLeaseRate the generalDetailsBaseLeaseRate to set
	 */
	public void setGeneralDetailsBaseLeaseRate(Double generalDetailsBaseLeaseRate) {
		this.generalDetailsBaseLeaseRate = generalDetailsBaseLeaseRate;
	}



	/**
	 * @return the rentSchedulesCostPerUnit
	 */
	public Double getRentSchedulesCostPerUnit() {
		return rentSchedulesCostPerUnit;
	}



	/**
	 * @param rentSchedulesCostPerUnit the rentSchedulesCostPerUnit to set
	 */
	public void setRentSchedulesCostPerUnit(Double rentSchedulesCostPerUnit) {
		this.rentSchedulesCostPerUnit = rentSchedulesCostPerUnit;
	}



	/**
	 * @return the rentSchedulesExpectedCashPreTax
	 */
	public Double getRentSchedulesExpectedCashPreTax() {
		return rentSchedulesExpectedCashPreTax;
	}



	/**
	 * @param rentSchedulesExpectedCashPreTax the rentSchedulesExpectedCashPreTax to set
	 */
	public void setRentSchedulesExpectedCashPreTax(Double rentSchedulesExpectedCashPreTax) {
		this.rentSchedulesExpectedCashPreTax = rentSchedulesExpectedCashPreTax;
	}



	/**
	 * @return the rentSchedulesTotalTax
	 */
	public Double getRentSchedulesTotalTax() {
		return rentSchedulesTotalTax;
	}



	/**
	 * @param rentSchedulesTotalTax the rentSchedulesTotalTax to set
	 */
	public void setRentSchedulesTotalTax(Double rentSchedulesTotalTax) {
		this.rentSchedulesTotalTax = rentSchedulesTotalTax;
	}



	/**
	 * @return the rentSchedulesExpectedCashTotal
	 */
	public Double getRentSchedulesExpectedCashTotal() {
		return rentSchedulesExpectedCashTotal;
	}



	/**
	 * @param rentSchedulesExpectedCashTotal the rentSchedulesExpectedCashTotal to set
	 */
	public void setRentSchedulesExpectedCashTotal(Double rentSchedulesExpectedCashTotal) {
		this.rentSchedulesExpectedCashTotal = rentSchedulesExpectedCashTotal;
	}



	/**
	 * @return the rentSalesReportingDetailsBaseSalesFrom
	 */
	public Double getRentSalesReportingDetailsBaseSalesFrom() {
		return rentSalesReportingDetailsBaseSalesFrom;
	}



	/**
	 * @param rentSalesReportingDetailsBaseSalesFrom the rentSalesReportingDetailsBaseSalesFrom to set
	 */
	public void setRentSalesReportingDetailsBaseSalesFrom(Double rentSalesReportingDetailsBaseSalesFrom) {
		this.rentSalesReportingDetailsBaseSalesFrom = rentSalesReportingDetailsBaseSalesFrom;
	}



	/**
	 * @return the rentSalesReportingDetailsBaseSalesTo
	 */
	public Double getRentSalesReportingDetailsBaseSalesTo() {
		return rentSalesReportingDetailsBaseSalesTo;
	}



	/**
	 * @param rentSalesReportingDetailsBaseSalesTo the rentSalesReportingDetailsBaseSalesTo to set
	 */
	public void setRentSalesReportingDetailsBaseSalesTo(Double rentSalesReportingDetailsBaseSalesTo) {
		this.rentSalesReportingDetailsBaseSalesTo = rentSalesReportingDetailsBaseSalesTo;
	}



	/**
	 * @return the rentSalesExclusionsCapAmount
	 */
	public Double getRentSalesExclusionsCapAmount() {
		return rentSalesExclusionsCapAmount;
	}



	/**
	 * @param rentSalesExclusionsCapAmount the rentSalesExclusionsCapAmount to set
	 */
	public void setRentSalesExclusionsCapAmount(Double rentSalesExclusionsCapAmount) {
		this.rentSalesExclusionsCapAmount = rentSalesExclusionsCapAmount;
	}



	/**
	 * @return the rentAllowableDeductionsCapAmount
	 */
	public Double getRentAllowableDeductionsCapAmount() {
		return rentAllowableDeductionsCapAmount;
	}



	/**
	 * @param rentAllowableDeductionsCapAmount the rentAllowableDeductionsCapAmount to set
	 */
	public void setRentAllowableDeductionsCapAmount(Double rentAllowableDeductionsCapAmount) {
		this.rentAllowableDeductionsCapAmount = rentAllowableDeductionsCapAmount;
	}



	/**
	 * @return the rentPercentRentSchedulesCostPerUnit
	 */
	public Double getRentPercentRentSchedulesCostPerUnit() {
		return rentPercentRentSchedulesCostPerUnit;
	}



	/**
	 * @param rentPercentRentSchedulesCostPerUnit the rentPercentRentSchedulesCostPerUnit to set
	 */
	public void setRentPercentRentSchedulesCostPerUnit(Double rentPercentRentSchedulesCostPerUnit) {
		this.rentPercentRentSchedulesCostPerUnit = rentPercentRentSchedulesCostPerUnit;
	}



	/**
	 * @return the rentPercentRentSchedulesExpectedCashAmount
	 */
	public Double getRentPercentRentSchedulesExpectedCashAmount() {
		return rentPercentRentSchedulesExpectedCashAmount;
	}



	/**
	 * @param rentPercentRentSchedulesExpectedCashAmount the rentPercentRentSchedulesExpectedCashAmount to set
	 */
	public void setRentPercentRentSchedulesExpectedCashAmount(Double rentPercentRentSchedulesExpectedCashAmount) {
		this.rentPercentRentSchedulesExpectedCashAmount = rentPercentRentSchedulesExpectedCashAmount;
	}



	/**
	 * @return the rentPercentRentSchedulesTotalTaxAmount
	 */
	public Double getRentPercentRentSchedulesTotalTaxAmount() {
		return rentPercentRentSchedulesTotalTaxAmount;
	}



	/**
	 * @param rentPercentRentSchedulesTotalTaxAmount the rentPercentRentSchedulesTotalTaxAmount to set
	 */
	public void setRentPercentRentSchedulesTotalTaxAmount(Double rentPercentRentSchedulesTotalTaxAmount) {
		this.rentPercentRentSchedulesTotalTaxAmount = rentPercentRentSchedulesTotalTaxAmount;
	}



	/**
	 * @return the rentPercentRentSchedulesTotalCashWithTax
	 */
	public Double getRentPercentRentSchedulesTotalCashWithTax() {
		return rentPercentRentSchedulesTotalCashWithTax;
	}



	/**
	 * @param rentPercentRentSchedulesTotalCashWithTax the rentPercentRentSchedulesTotalCashWithTax to set
	 */
	public void setRentPercentRentSchedulesTotalCashWithTax(Double rentPercentRentSchedulesTotalCashWithTax) {
		this.rentPercentRentSchedulesTotalCashWithTax = rentPercentRentSchedulesTotalCashWithTax;
	}



	/**
	 * @return the rentCommissionDetailsExpectedAmount
	 */
	public Double getRentCommissionDetailsExpectedAmount() {
		return rentCommissionDetailsExpectedAmount;
	}



	/**
	 * @param rentCommissionDetailsExpectedAmount the rentCommissionDetailsExpectedAmount to set
	 */
	public void setRentCommissionDetailsExpectedAmount(Double rentCommissionDetailsExpectedAmount) {
		this.rentCommissionDetailsExpectedAmount = rentCommissionDetailsExpectedAmount;
	}



	/**
	 * @return the rentCommissionDetailsAmountDue
	 */
	public Double getRentCommissionDetailsAmountDue() {
		return rentCommissionDetailsAmountDue;
	}



	/**
	 * @param rentCommissionDetailsAmountDue the rentCommissionDetailsAmountDue to set
	 */
	public void setRentCommissionDetailsAmountDue(Double rentCommissionDetailsAmountDue) {
		this.rentCommissionDetailsAmountDue = rentCommissionDetailsAmountDue;
	}



	/**
	 * @return the rentCommissionSchedulesCostPerUnit
	 */
	public Double getRentCommissionSchedulesCostPerUnit() {
		return rentCommissionSchedulesCostPerUnit;
	}



	/**
	 * @param rentCommissionSchedulesCostPerUnit the rentCommissionSchedulesCostPerUnit to set
	 */
	public void setRentCommissionSchedulesCostPerUnit(Double rentCommissionSchedulesCostPerUnit) {
		this.rentCommissionSchedulesCostPerUnit = rentCommissionSchedulesCostPerUnit;
	}



	/**
	 * @return the rentCommissionSchedulesExpectedCashAmount
	 */
	public Double getRentCommissionSchedulesExpectedCashAmount() {
		return rentCommissionSchedulesExpectedCashAmount;
	}



	/**
	 * @param rentCommissionSchedulesExpectedCashAmount the rentCommissionSchedulesExpectedCashAmount to set
	 */
	public void setRentCommissionSchedulesExpectedCashAmount(Double rentCommissionSchedulesExpectedCashAmount) {
		this.rentCommissionSchedulesExpectedCashAmount = rentCommissionSchedulesExpectedCashAmount;
	}



	/**
	 * @return the rentCommissionSchedulesTotalTaxAmount
	 */
	public Double getRentCommissionSchedulesTotalTaxAmount() {
		return rentCommissionSchedulesTotalTaxAmount;
	}



	/**
	 * @param rentCommissionSchedulesTotalTaxAmount the rentCommissionSchedulesTotalTaxAmount to set
	 */
	public void setRentCommissionSchedulesTotalTaxAmount(Double rentCommissionSchedulesTotalTaxAmount) {
		this.rentCommissionSchedulesTotalTaxAmount = rentCommissionSchedulesTotalTaxAmount;
	}



	/**
	 * @return the rentCommissionSchedulesTotalCashWithTax
	 */
	public Double getRentCommissionSchedulesTotalCashWithTax() {
		return rentCommissionSchedulesTotalCashWithTax;
	}



	/**
	 * @param rentCommissionSchedulesTotalCashWithTax the rentCommissionSchedulesTotalCashWithTax to set
	 */
	public void setRentCommissionSchedulesTotalCashWithTax(Double rentCommissionSchedulesTotalCashWithTax) {
		this.rentCommissionSchedulesTotalCashWithTax = rentCommissionSchedulesTotalCashWithTax;
	}



	/**
	 * @return the securityDepositDepositDetailsDepositAmount
	 */
	public Double getSecurityDepositDepositDetailsDepositAmount() {
		return securityDepositDepositDetailsDepositAmount;
	}



	/**
	 * @param securityDepositDepositDetailsDepositAmount the securityDepositDepositDetailsDepositAmount to set
	 */
	public void setSecurityDepositDepositDetailsDepositAmount(Double securityDepositDepositDetailsDepositAmount) {
		this.securityDepositDepositDetailsDepositAmount = securityDepositDepositDetailsDepositAmount;
	}



	/**
	 * @return the securityDepositDepositDetailsExpectedReturnedAmount
	 */
	public Double getSecurityDepositDepositDetailsExpectedReturnedAmount() {
		return securityDepositDepositDetailsExpectedReturnedAmount;
	}



	/**
	 * @param securityDepositDepositDetailsExpectedReturnedAmount the securityDepositDepositDetailsExpectedReturnedAmount to set
	 */
	public void setSecurityDepositDepositDetailsExpectedReturnedAmount(
			Double securityDepositDepositDetailsExpectedReturnedAmount) {
		this.securityDepositDepositDetailsExpectedReturnedAmount = securityDepositDepositDetailsExpectedReturnedAmount;
	}



	/**
	 * @return the securityDepositDepositDetailsAccountBalance
	 */
	public Double getSecurityDepositDepositDetailsAccountBalance() {
		return securityDepositDepositDetailsAccountBalance;
	}



	/**
	 * @param securityDepositDepositDetailsAccountBalance the securityDepositDepositDetailsAccountBalance to set
	 */
	public void setSecurityDepositDepositDetailsAccountBalance(Double securityDepositDepositDetailsAccountBalance) {
		this.securityDepositDepositDetailsAccountBalance = securityDepositDepositDetailsAccountBalance;
	}



	/**
	 * @return the securityDepositDepositDetailsRequiredAmount
	 */
	public Double getSecurityDepositDepositDetailsRequiredAmount() {
		return securityDepositDepositDetailsRequiredAmount;
	}



	/**
	 * @param securityDepositDepositDetailsRequiredAmount the securityDepositDepositDetailsRequiredAmount to set
	 */
	public void setSecurityDepositDepositDetailsRequiredAmount(Double securityDepositDepositDetailsRequiredAmount) {
		this.securityDepositDepositDetailsRequiredAmount = securityDepositDepositDetailsRequiredAmount;
	}



	/**
	 * @return the optionsTenantRenewalAndOtherOptionsRenewalRate
	 */
	public Double getOptionsTenantRenewalAndOtherOptionsRenewalRate() {
		return optionsTenantRenewalAndOtherOptionsRenewalRate;
	}



	/**
	 * @param optionsTenantRenewalAndOtherOptionsRenewalRate the optionsTenantRenewalAndOtherOptionsRenewalRate to set
	 */
	public void setOptionsTenantRenewalAndOtherOptionsRenewalRate(Double optionsTenantRenewalAndOtherOptionsRenewalRate) {
		this.optionsTenantRenewalAndOtherOptionsRenewalRate = optionsTenantRenewalAndOtherOptionsRenewalRate;
	}



	/**
	 * @return the optionsTenantRenewalAndOtherOptionsPurchasePrice
	 */
	public Double getOptionsTenantRenewalAndOtherOptionsPurchasePrice() {
		return optionsTenantRenewalAndOtherOptionsPurchasePrice;
	}



	/**
	 * @param optionsTenantRenewalAndOtherOptionsPurchasePrice the optionsTenantRenewalAndOtherOptionsPurchasePrice to set
	 */
	public void setOptionsTenantRenewalAndOtherOptionsPurchasePrice(
			Double optionsTenantRenewalAndOtherOptionsPurchasePrice) {
		this.optionsTenantRenewalAndOtherOptionsPurchasePrice = optionsTenantRenewalAndOtherOptionsPurchasePrice;
	}



	/**
	 * @return the optionsTenantRenewalAndOtherOptionsPenalty
	 */
	public Double getOptionsTenantRenewalAndOtherOptionsPenalty() {
		return optionsTenantRenewalAndOtherOptionsPenalty;
	}



	/**
	 * @param optionsTenantRenewalAndOtherOptionsPenalty the optionsTenantRenewalAndOtherOptionsPenalty to set
	 */
	public void setOptionsTenantRenewalAndOtherOptionsPenalty(Double optionsTenantRenewalAndOtherOptionsPenalty) {
		this.optionsTenantRenewalAndOtherOptionsPenalty = optionsTenantRenewalAndOtherOptionsPenalty;
	}



	/**
	 * @return the rightsAlterationsAlterationsThresholdAmountIfAny
	 */
	public Double getRightsAlterationsAlterationsThresholdAmountIfAny() {
		return rightsAlterationsAlterationsThresholdAmountIfAny;
	}



	/**
	 * @param rightsAlterationsAlterationsThresholdAmountIfAny the rightsAlterationsAlterationsThresholdAmountIfAny to set
	 */
	public void setRightsAlterationsAlterationsThresholdAmountIfAny(
			Double rightsAlterationsAlterationsThresholdAmountIfAny) {
		this.rightsAlterationsAlterationsThresholdAmountIfAny = rightsAlterationsAlterationsThresholdAmountIfAny;
	}



	/**
	 * @return the rightsHoldoverHoldoverRentPenaltyAmount
	 */
	public Double getRightsHoldoverHoldoverRentPenaltyAmount() {
		return rightsHoldoverHoldoverRentPenaltyAmount;
	}



	/**
	 * @param rightsHoldoverHoldoverRentPenaltyAmount the rightsHoldoverHoldoverRentPenaltyAmount to set
	 */
	public void setRightsHoldoverHoldoverRentPenaltyAmount(Double rightsHoldoverHoldoverRentPenaltyAmount) {
		this.rightsHoldoverHoldoverRentPenaltyAmount = rightsHoldoverHoldoverRentPenaltyAmount;
	}



	/**
	 * @return the rightsOtherRightsCovenantAmount
	 */
	public Double getRightsOtherRightsCovenantAmount() {
		return rightsOtherRightsCovenantAmount;
	}



	/**
	 * @param rightsOtherRightsCovenantAmount the rightsOtherRightsCovenantAmount to set
	 */
	public void setRightsOtherRightsCovenantAmount(Double rightsOtherRightsCovenantAmount) {
		this.rightsOtherRightsCovenantAmount = rightsOtherRightsCovenantAmount;
	}



	/**
	 * @return the allowancesImprovementClauseDetailsAllowanceAmount
	 */
	public Double getAllowancesImprovementClauseDetailsAllowanceAmount() {
		return allowancesImprovementClauseDetailsAllowanceAmount;
	}



	/**
	 * @param allowancesImprovementClauseDetailsAllowanceAmount the allowancesImprovementClauseDetailsAllowanceAmount to set
	 */
	public void setAllowancesImprovementClauseDetailsAllowanceAmount(
			Double allowancesImprovementClauseDetailsAllowanceAmount) {
		this.allowancesImprovementClauseDetailsAllowanceAmount = allowancesImprovementClauseDetailsAllowanceAmount;
	}



	/**
	 * @return the allowancesImprovementClauseDetailsPerArea
	 */
	public Double getAllowancesImprovementClauseDetailsPerArea() {
		return allowancesImprovementClauseDetailsPerArea;
	}



	/**
	 * @param allowancesImprovementClauseDetailsPerArea the allowancesImprovementClauseDetailsPerArea to set
	 */
	public void setAllowancesImprovementClauseDetailsPerArea(Double allowancesImprovementClauseDetailsPerArea) {
		this.allowancesImprovementClauseDetailsPerArea = allowancesImprovementClauseDetailsPerArea;
	}



	/**
	 * @return the allowancesImprovementClauseDetailsAllowanceRequested
	 */
	public Double getAllowancesImprovementClauseDetailsAllowanceRequested() {
		return allowancesImprovementClauseDetailsAllowanceRequested;
	}



	/**
	 * @param allowancesImprovementClauseDetailsAllowanceRequested the allowancesImprovementClauseDetailsAllowanceRequested to set
	 */
	public void setAllowancesImprovementClauseDetailsAllowanceRequested(
			Double allowancesImprovementClauseDetailsAllowanceRequested) {
		this.allowancesImprovementClauseDetailsAllowanceRequested = allowancesImprovementClauseDetailsAllowanceRequested;
	}



	/**
	 * @return the allowancesImprovementClauseDetailsAmountReceived
	 */
	public Double getAllowancesImprovementClauseDetailsAmountReceived() {
		return allowancesImprovementClauseDetailsAmountReceived;
	}



	/**
	 * @param allowancesImprovementClauseDetailsAmountReceived the allowancesImprovementClauseDetailsAmountReceived to set
	 */
	public void setAllowancesImprovementClauseDetailsAmountReceived(
			Double allowancesImprovementClauseDetailsAmountReceived) {
		this.allowancesImprovementClauseDetailsAmountReceived = allowancesImprovementClauseDetailsAmountReceived;
	}



	/**
	 * @return the allowancesImprovementClauseDetailsAllowanceRemaining
	 */
	public Double getAllowancesImprovementClauseDetailsAllowanceRemaining() {
		return allowancesImprovementClauseDetailsAllowanceRemaining;
	}



	/**
	 * @param allowancesImprovementClauseDetailsAllowanceRemaining the allowancesImprovementClauseDetailsAllowanceRemaining to set
	 */
	public void setAllowancesImprovementClauseDetailsAllowanceRemaining(
			Double allowancesImprovementClauseDetailsAllowanceRemaining) {
		this.allowancesImprovementClauseDetailsAllowanceRemaining = allowancesImprovementClauseDetailsAllowanceRemaining;
	}



	/**
	 * @return the opexcamCamAuditSetupBaseCost
	 */
	public Double getOpexcamCamAuditSetupBaseCost() {
		return opexcamCamAuditSetupBaseCost;
	}



	/**
	 * @param opexcamCamAuditSetupBaseCost the opexcamCamAuditSetupBaseCost to set
	 */
	public void setOpexcamCamAuditSetupBaseCost(Double opexcamCamAuditSetupBaseCost) {
		this.opexcamCamAuditSetupBaseCost = opexcamCamAuditSetupBaseCost;
	}



	/**
	 * @return the opexcamCamAuditSetupBaseYearCapAmount
	 */
	public Double getOpexcamCamAuditSetupBaseYearCapAmount() {
		return opexcamCamAuditSetupBaseYearCapAmount;
	}



	/**
	 * @param opexcamCamAuditSetupBaseYearCapAmount the opexcamCamAuditSetupBaseYearCapAmount to set
	 */
	public void setOpexcamCamAuditSetupBaseYearCapAmount(Double opexcamCamAuditSetupBaseYearCapAmount) {
		this.opexcamCamAuditSetupBaseYearCapAmount = opexcamCamAuditSetupBaseYearCapAmount;
	}



	/**
	 * @return the opexcamServicesIncludedEstimatedCost
	 */
	public Double getOpexcamServicesIncludedEstimatedCost() {
		return opexcamServicesIncludedEstimatedCost;
	}



	/**
	 * @param opexcamServicesIncludedEstimatedCost the opexcamServicesIncludedEstimatedCost to set
	 */
	public void setOpexcamServicesIncludedEstimatedCost(Double opexcamServicesIncludedEstimatedCost) {
		this.opexcamServicesIncludedEstimatedCost = opexcamServicesIncludedEstimatedCost;
	}



	/**
	 * @return the opexcamServicesIncludedProportionateSharePercent
	 */
	public Double getOpexcamServicesIncludedProportionateSharePercent() {
		return opexcamServicesIncludedProportionateSharePercent;
	}



	/**
	 * @param opexcamServicesIncludedProportionateSharePercent the opexcamServicesIncludedProportionateSharePercent to set
	 */
	public void setOpexcamServicesIncludedProportionateSharePercent(
			Double opexcamServicesIncludedProportionateSharePercent) {
		this.opexcamServicesIncludedProportionateSharePercent = opexcamServicesIncludedProportionateSharePercent;
	}



	/**
	 * @return the opexcamServicesIncludedServiceCapAmount
	 */
	public Double getOpexcamServicesIncludedServiceCapAmount() {
		return opexcamServicesIncludedServiceCapAmount;
	}



	/**
	 * @param opexcamServicesIncludedServiceCapAmount the opexcamServicesIncludedServiceCapAmount to set
	 */
	public void setOpexcamServicesIncludedServiceCapAmount(Double opexcamServicesIncludedServiceCapAmount) {
		this.opexcamServicesIncludedServiceCapAmount = opexcamServicesIncludedServiceCapAmount;
	}



	/**
	 * @return the opexcamCamSchedulesCostPerUnit
	 */
	public Double getOpexcamCamSchedulesCostPerUnit() {
		return opexcamCamSchedulesCostPerUnit;
	}



	/**
	 * @param opexcamCamSchedulesCostPerUnit the opexcamCamSchedulesCostPerUnit to set
	 */
	public void setOpexcamCamSchedulesCostPerUnit(Double opexcamCamSchedulesCostPerUnit) {
		this.opexcamCamSchedulesCostPerUnit = opexcamCamSchedulesCostPerUnit;
	}



	/**
	 * @return the opexcamCamSchedulesExpectedCashAmount
	 */
	public Double getOpexcamCamSchedulesExpectedCashAmount() {
		return opexcamCamSchedulesExpectedCashAmount;
	}



	/**
	 * @param opexcamCamSchedulesExpectedCashAmount the opexcamCamSchedulesExpectedCashAmount to set
	 */
	public void setOpexcamCamSchedulesExpectedCashAmount(Double opexcamCamSchedulesExpectedCashAmount) {
		this.opexcamCamSchedulesExpectedCashAmount = opexcamCamSchedulesExpectedCashAmount;
	}



	/**
	 * @return the opexcamCamSchedulesTotalTaxAmount
	 */
	public Double getOpexcamCamSchedulesTotalTaxAmount() {
		return opexcamCamSchedulesTotalTaxAmount;
	}



	/**
	 * @param opexcamCamSchedulesTotalTaxAmount the opexcamCamSchedulesTotalTaxAmount to set
	 */
	public void setOpexcamCamSchedulesTotalTaxAmount(Double opexcamCamSchedulesTotalTaxAmount) {
		this.opexcamCamSchedulesTotalTaxAmount = opexcamCamSchedulesTotalTaxAmount;
	}



	/**
	 * @return the opexcamCamSchedulesTotalCashWithTax
	 */
	public Double getOpexcamCamSchedulesTotalCashWithTax() {
		return opexcamCamSchedulesTotalCashWithTax;
	}



	/**
	 * @param opexcamCamSchedulesTotalCashWithTax the opexcamCamSchedulesTotalCashWithTax to set
	 */
	public void setOpexcamCamSchedulesTotalCashWithTax(Double opexcamCamSchedulesTotalCashWithTax) {
		this.opexcamCamSchedulesTotalCashWithTax = opexcamCamSchedulesTotalCashWithTax;
	}



	/**
	 * @return the insuranceInsuranceClauseDetailsAggregateCoverageAmount
	 */
	public Double getInsuranceInsuranceClauseDetailsAggregateCoverageAmount() {
		return insuranceInsuranceClauseDetailsAggregateCoverageAmount;
	}



	/**
	 * @param insuranceInsuranceClauseDetailsAggregateCoverageAmount the insuranceInsuranceClauseDetailsAggregateCoverageAmount to set
	 */
	public void setInsuranceInsuranceClauseDetailsAggregateCoverageAmount(
			Double insuranceInsuranceClauseDetailsAggregateCoverageAmount) {
		this.insuranceInsuranceClauseDetailsAggregateCoverageAmount = insuranceInsuranceClauseDetailsAggregateCoverageAmount;
	}



	/**
	 * @return the insuranceInsuranceClauseDetailsUmbrellaExcess
	 */
	public Double getInsuranceInsuranceClauseDetailsUmbrellaExcess() {
		return insuranceInsuranceClauseDetailsUmbrellaExcess;
	}



	/**
	 * @param insuranceInsuranceClauseDetailsUmbrellaExcess the insuranceInsuranceClauseDetailsUmbrellaExcess to set
	 */
	public void setInsuranceInsuranceClauseDetailsUmbrellaExcess(Double insuranceInsuranceClauseDetailsUmbrellaExcess) {
		this.insuranceInsuranceClauseDetailsUmbrellaExcess = insuranceInsuranceClauseDetailsUmbrellaExcess;
	}



	/**
	 * @return the insuranceInsuranceClauseDetailsAutoLiability
	 */
	public Double getInsuranceInsuranceClauseDetailsAutoLiability() {
		return insuranceInsuranceClauseDetailsAutoLiability;
	}



	/**
	 * @param insuranceInsuranceClauseDetailsAutoLiability the insuranceInsuranceClauseDetailsAutoLiability to set
	 */
	public void setInsuranceInsuranceClauseDetailsAutoLiability(Double insuranceInsuranceClauseDetailsAutoLiability) {
		this.insuranceInsuranceClauseDetailsAutoLiability = insuranceInsuranceClauseDetailsAutoLiability;
	}



	/**
	 * @return the insuranceInsuranceClauseDetailsWorkersComp
	 */
	public Double getInsuranceInsuranceClauseDetailsWorkersComp() {
		return insuranceInsuranceClauseDetailsWorkersComp;
	}



	/**
	 * @param insuranceInsuranceClauseDetailsWorkersComp the insuranceInsuranceClauseDetailsWorkersComp to set
	 */
	public void setInsuranceInsuranceClauseDetailsWorkersComp(Double insuranceInsuranceClauseDetailsWorkersComp) {
		this.insuranceInsuranceClauseDetailsWorkersComp = insuranceInsuranceClauseDetailsWorkersComp;
	}



	/**
	 * @return the insuranceInsuranceClauseDetailsOtherCoverage
	 */
	public Double getInsuranceInsuranceClauseDetailsOtherCoverage() {
		return insuranceInsuranceClauseDetailsOtherCoverage;
	}



	/**
	 * @param insuranceInsuranceClauseDetailsOtherCoverage the insuranceInsuranceClauseDetailsOtherCoverage to set
	 */
	public void setInsuranceInsuranceClauseDetailsOtherCoverage(Double insuranceInsuranceClauseDetailsOtherCoverage) {
		this.insuranceInsuranceClauseDetailsOtherCoverage = insuranceInsuranceClauseDetailsOtherCoverage;
	}



	/**
	 * @return the insuranceInsuranceClauseDetailsSelfInsuranceAmount
	 */
	public Double getInsuranceInsuranceClauseDetailsSelfInsuranceAmount() {
		return insuranceInsuranceClauseDetailsSelfInsuranceAmount;
	}



	/**
	 * @param insuranceInsuranceClauseDetailsSelfInsuranceAmount the insuranceInsuranceClauseDetailsSelfInsuranceAmount to set
	 */
	public void setInsuranceInsuranceClauseDetailsSelfInsuranceAmount(
			Double insuranceInsuranceClauseDetailsSelfInsuranceAmount) {
		this.insuranceInsuranceClauseDetailsSelfInsuranceAmount = insuranceInsuranceClauseDetailsSelfInsuranceAmount;
	}



	/**
	 * @return the insuranceInsuranceSchedulesCostPerUnit
	 */
	public Double getInsuranceInsuranceSchedulesCostPerUnit() {
		return insuranceInsuranceSchedulesCostPerUnit;
	}



	/**
	 * @param insuranceInsuranceSchedulesCostPerUnit the insuranceInsuranceSchedulesCostPerUnit to set
	 */
	public void setInsuranceInsuranceSchedulesCostPerUnit(Double insuranceInsuranceSchedulesCostPerUnit) {
		this.insuranceInsuranceSchedulesCostPerUnit = insuranceInsuranceSchedulesCostPerUnit;
	}



	/**
	 * @return the insuranceInsuranceSchedulesExpectedCashAmount
	 */
	public Double getInsuranceInsuranceSchedulesExpectedCashAmount() {
		return insuranceInsuranceSchedulesExpectedCashAmount;
	}



	/**
	 * @param insuranceInsuranceSchedulesExpectedCashAmount the insuranceInsuranceSchedulesExpectedCashAmount to set
	 */
	public void setInsuranceInsuranceSchedulesExpectedCashAmount(Double insuranceInsuranceSchedulesExpectedCashAmount) {
		this.insuranceInsuranceSchedulesExpectedCashAmount = insuranceInsuranceSchedulesExpectedCashAmount;
	}



	/**
	 * @return the insuranceInsuranceSchedulesTotalTaxAmount
	 */
	public Double getInsuranceInsuranceSchedulesTotalTaxAmount() {
		return insuranceInsuranceSchedulesTotalTaxAmount;
	}



	/**
	 * @param insuranceInsuranceSchedulesTotalTaxAmount the insuranceInsuranceSchedulesTotalTaxAmount to set
	 */
	public void setInsuranceInsuranceSchedulesTotalTaxAmount(Double insuranceInsuranceSchedulesTotalTaxAmount) {
		this.insuranceInsuranceSchedulesTotalTaxAmount = insuranceInsuranceSchedulesTotalTaxAmount;
	}



	/**
	 * @return the insuranceInsuranceSchedulesTotalCashWithTax
	 */
	public Double getInsuranceInsuranceSchedulesTotalCashWithTax() {
		return insuranceInsuranceSchedulesTotalCashWithTax;
	}



	/**
	 * @param insuranceInsuranceSchedulesTotalCashWithTax the insuranceInsuranceSchedulesTotalCashWithTax to set
	 */
	public void setInsuranceInsuranceSchedulesTotalCashWithTax(Double insuranceInsuranceSchedulesTotalCashWithTax) {
		this.insuranceInsuranceSchedulesTotalCashWithTax = insuranceInsuranceSchedulesTotalCashWithTax;
	}



	/**
	 * @return the taxSchedulesCostPerUnit
	 */
	public Double getTaxSchedulesCostPerUnit() {
		return taxSchedulesCostPerUnit;
	}



	/**
	 * @param taxSchedulesCostPerUnit the taxSchedulesCostPerUnit to set
	 */
	public void setTaxSchedulesCostPerUnit(Double taxSchedulesCostPerUnit) {
		this.taxSchedulesCostPerUnit = taxSchedulesCostPerUnit;
	}



	/**
	 * @return the taxSchedulesExpectedCashAmount
	 */
	public Double getTaxSchedulesExpectedCashAmount() {
		return taxSchedulesExpectedCashAmount;
	}



	/**
	 * @param taxSchedulesExpectedCashAmount the taxSchedulesExpectedCashAmount to set
	 */
	public void setTaxSchedulesExpectedCashAmount(Double taxSchedulesExpectedCashAmount) {
		this.taxSchedulesExpectedCashAmount = taxSchedulesExpectedCashAmount;
	}



	/**
	 * @return the taxSchedulesTotalTaxAmount
	 */
	public Double getTaxSchedulesTotalTaxAmount() {
		return taxSchedulesTotalTaxAmount;
	}



	/**
	 * @param taxSchedulesTotalTaxAmount the taxSchedulesTotalTaxAmount to set
	 */
	public void setTaxSchedulesTotalTaxAmount(Double taxSchedulesTotalTaxAmount) {
		this.taxSchedulesTotalTaxAmount = taxSchedulesTotalTaxAmount;
	}



	/**
	 * @return the taxSchedulesTotalCashWithTax
	 */
	public Double getTaxSchedulesTotalCashWithTax() {
		return taxSchedulesTotalCashWithTax;
	}



	/**
	 * @param taxSchedulesTotalCashWithTax the taxSchedulesTotalCashWithTax to set
	 */
	public void setTaxSchedulesTotalCashWithTax(Double taxSchedulesTotalCashWithTax) {
		this.taxSchedulesTotalCashWithTax = taxSchedulesTotalCashWithTax;
	}



	/**
	 * @return the parkingSpaceTypesRate
	 */
	public Double getParkingSpaceTypesRate() {
		return parkingSpaceTypesRate;
	}



	/**
	 * @param parkingSpaceTypesRate the parkingSpaceTypesRate to set
	 */
	public void setParkingSpaceTypesRate(Double parkingSpaceTypesRate) {
		this.parkingSpaceTypesRate = parkingSpaceTypesRate;
	}



	/**
	 * @return the coTenancyDetailsPlusPercentOfGla
	 */
	public Double getCoTenancyDetailsPlusPercentOfGla() {
		return coTenancyDetailsPlusPercentOfGla;
	}



	/**
	 * @param coTenancyDetailsPlusPercentOfGla the coTenancyDetailsPlusPercentOfGla to set
	 */
	public void setCoTenancyDetailsPlusPercentOfGla(Double coTenancyDetailsPlusPercentOfGla) {
		this.coTenancyDetailsPlusPercentOfGla = coTenancyDetailsPlusPercentOfGla;
	}



	/**
	 * @return the coTenancyDetailsRentReductionAmount
	 */
	public Double getCoTenancyDetailsRentReductionAmount() {
		return coTenancyDetailsRentReductionAmount;
	}



	/**
	 * @param coTenancyDetailsRentReductionAmount the coTenancyDetailsRentReductionAmount to set
	 */
	public void setCoTenancyDetailsRentReductionAmount(Double coTenancyDetailsRentReductionAmount) {
		this.coTenancyDetailsRentReductionAmount = coTenancyDetailsRentReductionAmount;
	}



	/**
	 * @return the coTenancyItemRentReductionTo
	 */
	public Double getCoTenancyItemRentReductionTo() {
		return coTenancyItemRentReductionTo;
	}



	/**
	 * @param coTenancyItemRentReductionTo the coTenancyItemRentReductionTo to set
	 */
	public void setCoTenancyItemRentReductionTo(Double coTenancyItemRentReductionTo) {
		this.coTenancyItemRentReductionTo = coTenancyItemRentReductionTo;
	}



	/**
	 * @return the coTenancyItemCoTenancyAmount
	 */
	public Double getCoTenancyItemCoTenancyAmount() {
		return coTenancyItemCoTenancyAmount;
	}



	/**
	 * @param coTenancyItemCoTenancyAmount the coTenancyItemCoTenancyAmount to set
	 */
	public void setCoTenancyItemCoTenancyAmount(Double coTenancyItemCoTenancyAmount) {
		this.coTenancyItemCoTenancyAmount = coTenancyItemCoTenancyAmount;
	}



	/**
	 * @return the responsibilitiesResponsibilityServiceCapAmount
	 */
	public Double getResponsibilitiesResponsibilityServiceCapAmount() {
		return responsibilitiesResponsibilityServiceCapAmount;
	}



	/**
	 * @param responsibilitiesResponsibilityServiceCapAmount the responsibilitiesResponsibilityServiceCapAmount to set
	 */
	public void setResponsibilitiesResponsibilityServiceCapAmount(Double responsibilitiesResponsibilityServiceCapAmount) {
		this.responsibilitiesResponsibilityServiceCapAmount = responsibilitiesResponsibilityServiceCapAmount;
	}



	/**
	 * @return the responsibilitiesResponsibilityServiceMinimumResponsibilityAmount
	 */
	public Double getResponsibilitiesResponsibilityServiceMinimumResponsibilityAmount() {
		return responsibilitiesResponsibilityServiceMinimumResponsibilityAmount;
	}



	/**
	 * @param responsibilitiesResponsibilityServiceMinimumResponsibilityAmount the responsibilitiesResponsibilityServiceMinimumResponsibilityAmount to set
	 */
	public void setResponsibilitiesResponsibilityServiceMinimumResponsibilityAmount(
			Double responsibilitiesResponsibilityServiceMinimumResponsibilityAmount) {
		this.responsibilitiesResponsibilityServiceMinimumResponsibilityAmount = responsibilitiesResponsibilityServiceMinimumResponsibilityAmount;
	}



	/**
	 * @return the responsibilitiesResponsibilityServiceMaximumCostPer
	 */
	public Double getResponsibilitiesResponsibilityServiceMaximumCostPer() {
		return responsibilitiesResponsibilityServiceMaximumCostPer;
	}



	/**
	 * @param responsibilitiesResponsibilityServiceMaximumCostPer the responsibilitiesResponsibilityServiceMaximumCostPer to set
	 */
	public void setResponsibilitiesResponsibilityServiceMaximumCostPer(
			Double responsibilitiesResponsibilityServiceMaximumCostPer) {
		this.responsibilitiesResponsibilityServiceMaximumCostPer = responsibilitiesResponsibilityServiceMaximumCostPer;
	}



	/**
	 * @return the otherClausesAmount
	 */
	public Double getOtherClausesAmount() {
		return otherClausesAmount;
	}



	/**
	 * @param otherClausesAmount the otherClausesAmount to set
	 */
	public void setOtherClausesAmount(Double otherClausesAmount) {
		this.otherClausesAmount = otherClausesAmount;
	}



	/**
	 * @return the accountingInitialDirectCosts
	 */
	public Double getAccountingInitialDirectCosts() {
		return accountingInitialDirectCosts;
	}



	/**
	 * @param accountingInitialDirectCosts the accountingInitialDirectCosts to set
	 */
	public void setAccountingInitialDirectCosts(Double accountingInitialDirectCosts) {
		this.accountingInitialDirectCosts = accountingInitialDirectCosts;
	}



	/**
	 * @return the accountingFasb13TreatmentFairMarketValue
	 */
	public Double getAccountingFasb13TreatmentFairMarketValue() {
		return accountingFasb13TreatmentFairMarketValue;
	}



	/**
	 * @param accountingFasb13TreatmentFairMarketValue the accountingFasb13TreatmentFairMarketValue to set
	 */
	public void setAccountingFasb13TreatmentFairMarketValue(Double accountingFasb13TreatmentFairMarketValue) {
		this.accountingFasb13TreatmentFairMarketValue = accountingFasb13TreatmentFairMarketValue;
	}



public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("**********  Here are my Finds  **********").append("\n");
        sb.append("General - General Details - Base Lease Rate: ").append( doubleToString( generalDetailsBaseLeaseRate )).append("\n");
        
        sb.append("Rent - Rent Schedules - Cost Per Unit: ").append( doubleToString( rentSchedulesCostPerUnit )).append("\n");
        sb.append("Rent - Rent Schedules - Expected Cash Pre Tax: ").append( doubleToString( rentSchedulesExpectedCashPreTax )).append("\n");
        sb.append("Rent - Rent Schedules - Total Tax: ").append( doubleToString( rentSchedulesTotalTax )).append("\n");
        sb.append("Rent - Rent Schedules - Expected Cash Total: ").append( doubleToString( rentSchedulesExpectedCashTotal )).append("\n");
        sb.append("Rent - Sales Reporting Details - Base Sales From: ").append( doubleToString( rentSalesReportingDetailsBaseSalesFrom )).append("\n");
        sb.append("Rent - Sales Reporting Details - Base Sales To: ").append( doubleToString( rentSalesReportingDetailsBaseSalesTo )).append("\n");
        sb.append("Rent - Sales Exclusions - Cap Amount: ").append( doubleToString( rentSalesExclusionsCapAmount )).append("\n");
        sb.append("Rent - Allowable Deductions - CapAmount: ").append( doubleToString( rentAllowableDeductionsCapAmount )).append("\n");
        sb.append("Rent - Percent Rent Schedules - Cost Per Unit: ").append( doubleToString( rentPercentRentSchedulesCostPerUnit )).append("\n");
        sb.append("Rent - Percent Rent Schedules - Expected Cash Amount: ").append( doubleToString( rentPercentRentSchedulesExpectedCashAmount )).append("\n");
        sb.append("Rent - Percent Rent Schedules - Total Tax Amount: ").append( doubleToString( rentPercentRentSchedulesTotalTaxAmount )).append("\n");
        sb.append("Rent - Percent Rent Schedules - Total Cash With Tax: ").append( doubleToString( rentPercentRentSchedulesTotalCashWithTax )).append("\n");
        sb.append("Rent - Commission Details - Expected Amount: ").append( doubleToString( rentCommissionDetailsExpectedAmount )).append("\n");
        sb.append("Rent - Commission Details - Amount Due: ").append( doubleToString( rentCommissionDetailsAmountDue )).append("\n");
        sb.append("Rent - Commission Schedules - Cost Per Unit: ").append( doubleToString( rentCommissionSchedulesCostPerUnit )).append("\n");
        sb.append("Rent - Commission Schedules - Expected Cash Amount: ").append( doubleToString( rentCommissionSchedulesExpectedCashAmount )).append("\n");
        sb.append("Rent - Commission Schedules - Total Tax Amount: ").append( doubleToString( rentCommissionSchedulesTotalTaxAmount )).append("\n");
        sb.append("Rent - Commission Schedules - Total Cash With Tax: ").append( doubleToString( rentCommissionSchedulesTotalCashWithTax )).append("\n");
        
        sb.append("security Deposit - Deposit Details - Deposit Amount: ").append( doubleToString( securityDepositDepositDetailsDepositAmount )).append("\n");
        sb.append("security Deposit - Deposit Details - Expected Returned Amount: ").append( doubleToString( securityDepositDepositDetailsExpectedReturnedAmount )).append("\n");
        sb.append("security Deposit - Deposit Details - Account Balance: ").append( doubleToString( securityDepositDepositDetailsAccountBalance )).append("\n");
        sb.append("security Deposit - Deposit Details - Required Amount: ").append( doubleToString( securityDepositDepositDetailsRequiredAmount )).append("\n");
        
        sb.append("Options - Tenant Renewal and Other Options - Renewal Rate: ").append( doubleToString( optionsTenantRenewalAndOtherOptionsRenewalRate )).append("\n");
        sb.append("Options - Tenant Renewal and Other Options - Purchase Price: ").append( doubleToString( optionsTenantRenewalAndOtherOptionsPurchasePrice )).append("\n");
        sb.append("Options - Tenant Renewal and Other Options - Penalty: ").append( doubleToString( optionsTenantRenewalAndOtherOptionsPenalty )).append("\n");
        
        sb.append("Rights - Alterations - Alterations Threshold Amount If Any: ").append( doubleToString( rightsAlterationsAlterationsThresholdAmountIfAny )).append("\n");
        sb.append("Rights - Holdover - Holdover Rent Penalty Amount: ").append( doubleToString( rightsHoldoverHoldoverRentPenaltyAmount )).append("\n");
        sb.append("Rights - Other Rights - Covenant Amount: ").append( doubleToString( rightsOtherRightsCovenantAmount )).append("\n");
        
        sb.append("Allowances - Improvement Clause Details - Allowance Amount: ").append( doubleToString( allowancesImprovementClauseDetailsAllowanceAmount )).append("\n");
        sb.append("Allowances - Improvement Clause Details - Per Area: ").append( doubleToString( allowancesImprovementClauseDetailsPerArea )).append("\n");
        sb.append("Allowances - Improvement Clause Details - Allowance Requested: ").append( doubleToString( allowancesImprovementClauseDetailsAllowanceRequested )).append("\n");
        sb.append("Allowances - Improvement Clause Details - Amount Received: ").append( doubleToString( allowancesImprovementClauseDetailsAmountReceived )).append("\n");
        sb.append("Allowances - Improvement Clause Details - Allowance Remaining: ").append( doubleToString( allowancesImprovementClauseDetailsAllowanceRemaining )).append("\n");
        
        sb.append("OPEX CAM - CAM Audit Setup - Base Cost: ").append( doubleToString( opexcamCamAuditSetupBaseCost )).append("\n");
        sb.append("OPEX CAM - CAM Audit Setup - Base Year Cap Amount: ").append( doubleToString( opexcamCamAuditSetupBaseYearCapAmount )).append("\n");
        sb.append("OPEX CAM - Services Included - Estimated Cost: ").append( doubleToString( opexcamServicesIncludedEstimatedCost )).append("\n");
        sb.append("OPEX CAM - Services Included - Proportionate Share Percent: ").append( doubleToString( opexcamServicesIncludedProportionateSharePercent )).append("\n");
        sb.append("OPEX CAM - Services Included - Service Cap Amount: ").append( doubleToString( opexcamServicesIncludedServiceCapAmount )).append("\n");
        sb.append("OPEX CAM - CAM Schedules - Cost Per Unit: ").append( doubleToString( opexcamCamSchedulesCostPerUnit )).append("\n");
        sb.append("OPEX CAM - CAM Schedules - Expected Cash Amount: ").append( doubleToString( opexcamCamSchedulesExpectedCashAmount )).append("\n");
        sb.append("OPEX CAM - CAM Schedules - Total Tax Amount: ").append( doubleToString( opexcamCamSchedulesTotalTaxAmount )).append("\n");
        sb.append("OPEX CAM - CAM Schedules - Total Cash With Tax: ").append( doubleToString( opexcamCamSchedulesTotalCashWithTax )).append("\n");
        
        sb.append("Insurance - Insurance Clause Details - Aggregate Coverage Amount: ").append( doubleToString( insuranceInsuranceClauseDetailsAggregateCoverageAmount )).append("\n");
        sb.append("Insurance - Insurance Clause Details - Umbrella Excess: ").append( doubleToString( insuranceInsuranceClauseDetailsUmbrellaExcess )).append("\n");
        sb.append("Insurance - Insurance Clause Details - Auto Liability: ").append( doubleToString( insuranceInsuranceClauseDetailsAutoLiability )).append("\n");
        sb.append("Insurance - Insurance Clause Details - Workers Comp: ").append( doubleToString( insuranceInsuranceClauseDetailsWorkersComp )).append("\n");
        sb.append("Insurance - Insurance Clause Details - Other Coverage: ").append( doubleToString( insuranceInsuranceClauseDetailsOtherCoverage )).append("\n");
        sb.append("Insurance - Insurance Clause Details - Self Insurance Amount: ").append( doubleToString( insuranceInsuranceClauseDetailsSelfInsuranceAmount )).append("\n");
        sb.append("Insurance - Insurance Schedules - Cost Per Unit: ").append( doubleToString( insuranceInsuranceSchedulesCostPerUnit )).append("\n");
        sb.append("Insurance - Insurance Schedules - Expected Cash Amount: ").append( doubleToString( insuranceInsuranceSchedulesExpectedCashAmount )).append("\n");
        sb.append("Insurance - Insurance Schedules - Total Tax Amount: ").append( doubleToString( insuranceInsuranceSchedulesTotalTaxAmount )).append("\n");
        sb.append("Insurance - Insurance Schedules - Total Cash With Tax: ").append( doubleToString( insuranceInsuranceSchedulesTotalCashWithTax )).append("\n");
        
        sb.append("Tax - Tax Schedules - Cost Per Unit: ").append( doubleToString( taxSchedulesCostPerUnit )).append("\n");
        sb.append("Tax - Tax Schedules - Expected Cash Amount: ").append( doubleToString( taxSchedulesExpectedCashAmount )).append("\n");
        sb.append("Tax - Tax Schedules - Total Tax Amount: ").append( doubleToString( taxSchedulesTotalTaxAmount )).append("\n");
        sb.append("Tax - Tax Schedules - Total Cash With Tax: ").append( doubleToString( taxSchedulesTotalCashWithTax )).append("\n");
        
        sb.append("parking - Space Types - Rate: ").append( doubleToString( parkingSpaceTypesRate )).append("\n");
        
        sb.append("Co-Tenancy - Co-Tenancy Details - Plus Percent Of GLA: ").append( doubleToString( coTenancyDetailsPlusPercentOfGla )).append("\n");
        sb.append("Co-Tenancy - Co-Tenancy Details - Rent Reduction Amount: ").append( doubleToString( coTenancyDetailsRentReductionAmount )).append("\n");
        sb.append("Co-Tenancy - Co-Tenancy Item - Rent Reduction To: ").append( doubleToString( coTenancyItemRentReductionTo )).append("\n");
        sb.append("Co-Tenancy - Co-Tenancy Item - Co-Tenancy Amount: ").append( doubleToString( coTenancyItemCoTenancyAmount )).append("\n");
        
        sb.append("Responsibilities - Responsibility Service - Cap Amount: ").append( doubleToString( responsibilitiesResponsibilityServiceCapAmount )).append("\n");
        sb.append("Responsibilities - Responsibility Service - Minimum Responsibility Amount: ").append( doubleToString( responsibilitiesResponsibilityServiceMinimumResponsibilityAmount )).append("\n");
        sb.append("Responsibilities - Responsibility Service - Maximum Cost Per: ").append( doubleToString( responsibilitiesResponsibilityServiceMaximumCostPer )).append("\n");
        
        sb.append("Other Clauses - Other Clauses - Amount: ").append( doubleToString( otherClausesAmount )).append("\n");
        
        sb.append("Accounting - Accounting - Initial Direct Costs: ").append( doubleToString( accountingInitialDirectCosts )).append("\n");
        sb.append("Accounting - FASB 13 Treatment - Fair Market Value: ").append( doubleToString( accountingFasb13TreatmentFairMarketValue )).append("\n");
                
        return sb.toString();
    }
   
   private String doubleToString(Double value) {
	   if(value!=null) {
		   return currancyFormatter.format( value );
	   }
	   return "<?>";	
   }
}
