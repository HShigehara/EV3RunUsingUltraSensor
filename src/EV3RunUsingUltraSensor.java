import lejos.hardware.motor.Motor; //���[�^�[�̐ݒ�
import lejos.hardware.port.SensorPort; //�Z���T�[�|�[�g�̐ݒ�
import lejos.hardware.sensor.EV3UltrasonicSensor; //�����g�Z���T�[�̐ݒ�
public class EV3RunUsingUltraSensor { //�N���X�̒�`
	public static void main(String[] args) { //main()
		long timeMillisStart = System.currentTimeMillis(); //���Ԃ�[ms]�Ŏ擾
		float[] ut_value = new float[1]; //
		////getDistanceMode a;
		////int angle2 = Motor.A.getTachoCount(); // should be -360
		EV3UltrasonicSensor us1 = new EV3UltrasonicSensor(SensorPort.S3); //�����g�Z���T�[�̃C���X�^���X���|�[�g3�Ő���
		float distance = 10; //�f�t�H���g�̋���(�߂Â��ꍇ�͓K���ɑ傫�����Ă���)
		
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


		while(distance > 0.4){ //������0.4[m]���傫���Ԃ͎��s����

   		Motor.B.setSpeed(100); //Default = 200
        Motor.A.setSpeed(100); //Default = 200
        Motor.B.forward(); //���[�^�[�𓮂���
        Motor.A.forward(); //���[�^�[�𓮂���
   		us1.getDistanceMode().fetchSample(ut_value, 0); //�������擾
   		distance = ut_value[0]; //�������i�[
   		}
		
		Motor.B.stop(); //���[�^�[���~
        Motor.A.stop(); //���[�^�[���~
	}
}
		//us1.enable();
		//us1.getDistanceMode();*/
