package com.anthem.helper;

import java.util.Iterator;

import org.springframework.stereotype.Component;

import com.anthem.model.PlanBenefits;
import com.anthem.model.ProductPlan;
import com.anthem.model.Quote;

@Component
public class PlanHelper {

	public void addPlanBenefitsToQuote(Quote quote) {

		Iterator<ProductPlan> quoteProductsIter = quote.getProduct().iterator();
		while (quoteProductsIter.hasNext()) {
			ProductPlan productPlan = (ProductPlan) quoteProductsIter.next();
			productPlan.setPlanBenefits(getPlanBenefits(productPlan));
		}
	}

	private PlanBenefits getPlanBenefits(ProductPlan productPlan) {
		PlanBenefits planBenefits = new PlanBenefits();
		planBenefits.setPlanBenefits("::planBenefits- SRI");
		planBenefits.setPlanDeductibles("::planDeductibles-Surya");
		return planBenefits;

	}
}
