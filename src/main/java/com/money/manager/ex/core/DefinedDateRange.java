/*
 * Copyright (C) 2012-2015 The Android Money Manager Ex Project Team
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.money.manager.ex.core;

import android.content.Context;

/**
 * Represent one selectable date range, i.e. Last 7 Days, Current Month, etc.
 */
public class DefinedDateRange {

    public DefinedDateRange(Context context) {
        this.context = context;
    }

    private Context context;

    public DefinedDateRangeName key;
    /**
     * Used for display sorting.
     */
    public int order;
    /**
     * Stores the id of the string for the name/title. i.e. R.string.last7days
     */
    public int nameResourceId;
    /**
     * Id of the menu resource used to display this date range in toolbars.
     */
    public int menuResourceId;

    public String getLocalizedName() {
        return this.context.getString(this.nameResourceId);
    }

    public String getName() {
        return this.key.toString();
    }

//    public void setMenuResourceId(int menuResourceId) {
//        this.menuResourceId = menuResourceId;
//    }
}
