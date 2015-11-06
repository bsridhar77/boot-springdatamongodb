package com.company.helper;

import java.util.Iterator;

import org.springframework.stereotype.Component;

import com.company.model.PlanBenefits;
import com.company.model.PlanProduct;
import com.company.model.Quote;

@Component
public class PlanHelper {

	public void addPlanBenefitsToQuote(Quote quote) {

		Iterator<PlanProduct> quoteProductsIter = quote.getProductRating().iterator();
		while (quoteProductsIter.hasNext()) {
			PlanProduct productPlan = (PlanProduct) quoteProductsIter.next();
			productPlan.setPlanBenefits(getPlanBenefits(productPlan));
		}
	}

	private PlanBenefits getPlanBenefits(PlanProduct productPlan) {
		PlanBenefits planBenefits = new PlanBenefits();
		planBenefits.setPlanBenefits("::planBenefits- SRI");
		planBenefits.setPlanDeductibles("::planDeductibles-Surya");
		return planBenefits;

	}
}
