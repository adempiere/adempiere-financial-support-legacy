/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * Copyright (C) 2003-2014 E.R.P. Consultores y Asociados, C.A.               *
 * All Rights Reserved.                                                       *
 * Contributor(s): Yamel Senih www.erpya.com                                  *
 *****************************************************************************/
package org.spin.util;

import org.spin.investment.model.MFMFunctionalSetting;

/**
 * Loan Daily Interest Calculation
 * Calculate Daily Interest
 * 			(A Variable)					(B Variable)
 * 			((1 + InterestRate) ^ (MonthlyDays / YEAR_DAY)) - 1
 *			Dunning Interest = (DaysDue * InterestRate)
 * @author Yamel Senih, ysenih@erpya.com , http://www.erpya.com
 *      <li> FR [ 1666 ] Calculate daily Loan Interest
 *		@see https://github.com/adempiere/adempiere/issues/1666
 */
public class LoanInterestProcess extends org.spin.investment.loan.util.LoanInterestProcess {

	public LoanInterestProcess(MFMFunctionalSetting setting) {
		super(setting);
	}
	//	Backward compatibility
}
