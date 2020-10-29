public class Places
{
	public static String find(int Distance)
	{
	System.out.println("Distance"+Distance);
	if(Distance<12){
		System.out.println("KOLHAPUR");
	return "KOLHAPUR";
	}
	if(Distance>12 && Distance<50 ){
		System.out.println("SANGALI");
	return "SANGALI";
	}
	if(Distance>50 && Distance<100 ){
		System.out.println("KARAD");
	return "KARAD";
	}
	if(Distance>100 && Distance<150 ){
		System.out.println("SATARA");
	return "SATARA";
	}
	if(Distance>150 && Distance<200 ){
		System.out.println("DANDELI");
	return "DANDELI";
	}
	if(Distance>200 && Distance<250 ){
		System.out.println("GOA");
	return "GOA";
	}
	if(Distance>250 && Distance<500 ){
		System.out.println("HUBBALI");
	return "HUBBALI";
	}
	if(Distance>500 && Distance<1000 ){
		System.out.println("BANGLORE");
	return "BANGLORE";
	}
		if(Distance>1000 && Distance<2000 ){
		System.out.println("RAJASTAN");
	return "RAJASTAN";
	}
		if(Distance>2000 && Distance<3000 ){
		System.out.println("SHRILANKA");
	return "SHRILANKA";
	}
	return "far";
}
}
