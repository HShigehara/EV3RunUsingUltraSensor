import lejos.hardware.motor.Motor; //モーターの設定
import lejos.hardware.port.SensorPort; //センサーポートの設定
import lejos.hardware.sensor.EV3UltrasonicSensor; //超音波センサーの設定
public class EV3RunUsingUltraSensor { //クラスの定義
	public static void main(String[] args) { //main()
		long timeMillisStart = System.currentTimeMillis(); //時間を[ms]で取得
		float[] ut_value = new float[1]; //
		////getDistanceMode a;
		////int angle2 = Motor.A.getTachoCount(); // should be -360
		EV3UltrasonicSensor us1 = new EV3UltrasonicSensor(SensorPort.S3); //超音波センサーのインスタンスをポート3で生成
		float distance = 10; //デフォルトの距離(近づく場合は適当に大きくしておく)
		
		/*while(dist > 0.25){
		Motor.A.setSpeed(200);// 2 RPM
        Motor.D.setSpeed(200);
        Motor.A.forward();
		Motor.D.forward();
		us1.getDistanceMode().fetchSample(ut_value, 0);
		dist = ut_value[0]; 
		}
		/*try{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer=new PrintWriter(new BufferedWriter(new FileWriter("rei.txt")));
			writer.println(dist);
			reader.close();
			writer.close();
			}
		catch (IOException e){
			System.out.println();
			}*/
		 //Motor.A.stop();
		 //Motor.D.stop();
	//}
//}
       //LCD.drawInt(angle2,0,0);
        //Delay.msDelay(1000);
        //long timeMillisEnd=System.currentTimeMillis();
        //long time=timeMillisEnd-timeMillisStart;
        //System.out.println(time +" ms."+time/1000+"s");
	//us1.close();


		while(distance > 0.4){ //距離が0.4[m]より大きい間は実行する

   		Motor.B.setSpeed(100); //Default = 200
        Motor.A.setSpeed(100); //Default = 200
        Motor.B.forward(); //モーターを動かす
        Motor.A.forward(); //モーターを動かす
   		us1.getDistanceMode().fetchSample(ut_value, 0); //距離を取得
   		distance = ut_value[0]; //距離を格納
   		}
		
		Motor.B.stop(); //モーターを停止
        Motor.A.stop(); //モーターを停止
	}
}
		//us1.enable();
		//us1.getDistanceMode();*/
