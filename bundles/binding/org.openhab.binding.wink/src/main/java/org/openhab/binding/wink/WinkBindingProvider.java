/**
 * Copyright (c) 2010-2015, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.wink;

import java.util.List;

import org.openhab.binding.wink.internal.WinkBindingConfig;
import org.openhab.core.binding.BindingProvider;

/**
 * @author Scott Hanson
 * @since 1.8.0
 */
public interface WinkBindingProvider extends BindingProvider
{
	/**
	 * Returns the configuration for the item with the given name.
	 * 
	 * @param itemName
	 * @return The configuration if there is an item with the given name, null
	 *         otherwise.
	 */
	public WinkBindingConfig getItemConfig(String itemName);

	/**
	 * Returns a list of item names
	 * 
	 * @return List of item names mapped to a Wink Binding
	 */
	public List<String> getInBindingItemNames();
}