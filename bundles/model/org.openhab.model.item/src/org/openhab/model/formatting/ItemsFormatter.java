/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
/*
 * generated by Xtext
 */
package org.openhab.model.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class ItemsFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		org.openhab.model.services.ItemsGrammarAccess f = (org.openhab.model.services.ItemsGrammarAccess) getGrammarAccess();

		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());

		c.setLinewrap().after(f.getModelNormalItemRule());
		c.setLinewrap().after(f.getModelGroupItemRule());
		
		c.setNoSpace().after(f.getModelItemAccess().getLeftParenthesisKeyword_4_0());
		c.setNoSpace().before(f.getModelItemAccess().getRightParenthesisKeyword_4_3());

		c.setNoSpace().before(f.getModelGroupItemAccess().getLeftParenthesisKeyword_2_2_2_0());
		
		for (Keyword comma : f.findKeywords(",")) {
			c.setNoSpace().before(comma);
		}

		for (Keyword colon : f.findKeywords(":")) {
			c.setNoSpace().before(colon);
			c.setNoSpace().after(colon);
		}
		
		for (Keyword eq : f.findKeywords("=")) {
			c.setNoSpace().before(eq);
			c.setNoSpace().after(eq);
		}
	}
}
