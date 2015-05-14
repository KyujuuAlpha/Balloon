package DragAndDrop;

import Buttons.NewMethodButton;
import util.panelDimension;

public class MethodTools extends Tools{

	public MethodTools(panelDimension dimension, String string) {
		super(dimension,string);
		addNewButton(new NewMethodButton(this, new MethodManager(dimension,string)));
	}

}
