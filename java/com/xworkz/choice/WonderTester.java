package com.xworkz.choice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.choice.dto.WonderDTO;
import com.xworkz.choice.dto.WonderDTO.WonderType;

public class WonderTester {

	public static void main(String[] args) {

		WonderDTO wonder1 = new WonderDTO("Taj-Mahal", "India", WonderType.AD);

		WonderDTO wonder2 = new WonderDTO("Great Wall", "China", WonderType.BC);

		WonderDTO wonder3 = new WonderDTO("Chichén Itza", "Mexico", WonderType.AD);

		WonderDTO wonder4 = new WonderDTO("Petra", "Jordan", WonderType.BC);

		WonderDTO wonder5 = new WonderDTO("Machu Picchu", "Machu Picchu", WonderType.BC);

		WonderDTO wonder6 = new WonderDTO("Christ the Redeemer", "Brazil", WonderType.BC);

		WonderDTO wonder7 = new WonderDTO("Colosseum", "Colosseum", WonderType.BC);

		List<WonderDTO> list = new ArrayList<WonderDTO>();
		list.add(wonder1);
		list.add(wonder2);
		list.add(wonder3);
		list.add(wonder4);
		list.add(wonder5);
		list.add(wonder6);
		list.add(wonder7);

		List<WonderDTO> list2 = new ArrayList<WonderDTO>();
		list.forEach(v -> {
			if (v.getPeriod().equals(WonderType.BC)) {
				list2.add(v);
			}
		});
		System.out.println(list2);

		Collections.sort(list2, (a1, a2) -> a1.getPlace().compareTo(a2.getPlace()));

		List<WonderDTO> list3 = new ArrayList<WonderDTO>();
		list2.forEach(w -> list3.add(w));
		System.out.println(list3);

		System.out.println("------------------------------------------------------------");
		List<String> list4 = list.stream().filter(z -> z.getPeriod().equals(WonderType.BC))
				.sorted((a1, a2) -> a1.getPlace().compareTo(a2.getPlace())).map(e -> e.getPlace())
				.collect(Collectors.toList());
		System.out.println(list4);
	}

}
