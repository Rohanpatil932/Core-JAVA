package com.xworkz.IPL;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.IPL.dto.IPLTeamDTO;
import com.xworkz.IPL.dto.IPLTeamDTO.jercyColor;

public class IplTester {

	public static void main(String[] args) {
		IPLTeamDTO dto = new IPLTeamDTO("MI", "WANKHEDE Stadium", 5, jercyColor.BLUE, "Nita Ambani");
		IPLTeamDTO dto1 = new IPLTeamDTO("CKS", "MA Chitadambaram", 3, jercyColor.YELLOW, "chayappa");
		IPLTeamDTO dto2 = new IPLTeamDTO("SRH", "Hydrabad Stadium", 2, jercyColor.ORANGE, "mohommadAli");
		IPLTeamDTO dto3 = new IPLTeamDTO("KXIIP", "kakeDa Stadium", 1, jercyColor.RED, "kumar Sing");
		IPLTeamDTO dto4 = new IPLTeamDTO("RCB", "chinnaswamy Stadium", 0, jercyColor.RED, "mallya");

		List<IPLTeamDTO> teamDTOs = new ArrayList<IPLTeamDTO>();
		teamDTOs.add(dto);
		teamDTOs.add(dto1);
		teamDTOs.add(dto2);
		teamDTOs.add(dto3);
		teamDTOs.add(dto4);

//		teamDTOs.forEach(s->System.out.println(s));
	float totRat=0;
//		teamDTOs.stream().filter(a->a.getRating()>=2)
//		.sorted((a,b)->Float.compare(a.getRating(),b.getRating()))
//		.forEach(System.out::println);
		
		teamDTOs.stream().filter(a->a.getRating()>=2).collect(Collectors.toList());
		for (IPLTeamDTO ipl: teamDTOs) {
			totRat=totRat+ipl.getRating();		
		}
		System.out.println(totRat);
		
		double sum = teamDTOs.stream().filter(a->a.getRating()>=2).mapToDouble(a->a.getRating()).sum();
		System.out.println(sum);
		
	}

}
