package com.learnwithguddu.mobilefactory.object;

import com.learnwithguddu.mobilefactory.mobile.Mobile;

public class Nothing implements Mobile {
@Override
public void order() {
	System.out.println("ordered Nothing");
}
}
