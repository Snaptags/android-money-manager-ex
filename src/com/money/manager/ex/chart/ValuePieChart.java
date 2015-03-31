/*
 * Copyright (C) 2012-2015 Alessandro Lazzari
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package com.money.manager.ex.chart;

import android.os.Parcel;
import android.os.Parcelable;

public class ValuePieChart implements Parcelable {
    private String mText;
    private double mValue;
    private String mValueFormatted;

    public ValuePieChart() {
	}

    public ValuePieChart(String text, double value) {
        setText(text);
        setValue(value);
	}

    public ValuePieChart(String text, double value, String valueFormatted) {
        setText(text);
        setValue(value);
		setValueFormatted(valueFormatted);
	}

	/**
     * @return the text
     */
    public String getText() {
        return mText;
    }

	/**
     * @param text the text to set
     */
    public void setText(String text) {
        mText = text;
    }

	/**
	 * @return the values
	 */
	public double getValue() {
        return mValue;
    }

	/**
     * @param value the values to set
     */
    public void setValue(double value) {
        mValue = value;
    }

	/**
	 * @return the valuesFormatted
	 */
	public String getValueFormatted() {
        return mValueFormatted;
    }

	/**
     * @param valueFormatted the valuesFormatted to set
     */
    public void setValueFormatted(String valueFormatted) {
        mValueFormatted = valueFormatted;
    }

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(getText());
        dest.writeDouble(getValue());
		dest.writeString(getValueFormatted());
	}
	
	public final static Parcelable.Creator<ValuePieChart> CREATOR = new Creator<ValuePieChart>() {
		
		@Override
		public ValuePieChart[] newArray(int size) {
			return new ValuePieChart[size];
		}
		
		@Override
		public ValuePieChart createFromParcel(Parcel source) {
			return new ValuePieChart(source.readString(), source.readDouble(), source.readString());
		}
	};
}
