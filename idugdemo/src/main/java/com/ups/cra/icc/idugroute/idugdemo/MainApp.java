package com.ups.cra.icc.idugroute.idugdemo;

import org.apache.camel.main.Main;

public class MainApp {

	public static void main(String[] args) throws Exception {
		
		Main main = new Main();
		main.enableHangupSupport();
		main.addRouteBuilder(new ShipmentRoute());
		main.run(args);

	}

}
