/*************************************************************************
 * File: DialogFactory.java
 * 
 * Creates the 'About' dialog.
 * 
 * Created: 7/3/2010
 * 
 * Author: Carter Dewey
 * 
 *************************************************************************
 *
 *   This file is part of Simple Chess Clock (SCC).
 *    
 *   SCC is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   SCC is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with SCC.  If not, see <http://www.gnu.org/licenses/>.
 *
 *************************************************************************/
package jason.cruz.simplestchessclock;

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;

public class DialogFactory {
	public DialogFactory() {
		
	}
	
	public Dialog AboutDialog(Context c, String MAJOR, String MINOR, String MINI) {
		Dialog d = new Dialog(c);
		
		d.setContentView(R.layout.about_dialog);
		d.setTitle("Simplest Chess Clock");


		
		return d;
	}

}
