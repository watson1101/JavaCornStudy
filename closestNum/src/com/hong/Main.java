package com.hong;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 对于给定的一组数据，找到任意个组合，使之最接近给定的某个数
 * 
 * @author hong
 *
 */
public class Main {

	public static void main(String[] args) {
		// 给定的某个数
		Double target = 1100d;
		// 给定的一组数据
		List<Double> list = new ArrayList<>();
		list.add(14.0);
		list.add(14.0);
		list.add(231.99);
		list.add(231.99);
		list.add(125.11);
		list.add(72.90);
		list.add(111.14);
		list.add(290.66);
		list.add(340.60);
		list.add(375.96);
		list.add(400d);
		list.add(400d);
		list.add(300d);

		cacl(list, target);

	}

	public static void cacl(List<Double> list, Double target) {
		list.sort(new Comparator<Double>() {

			@Override
			public int compare(Double arg0, Double arg1) {
				return arg0.compareTo(arg1);
			}
		});
		System.out.print("整理后的数组：");
		for (Double f : list) {
			System.out.print(f + "  ");
		}

		int length = list.size();
		List<List<Integer>> statusList = status(length);
		caclClose(statusList, list, target);
	}

	/**
	 * 返回状态机列表
	 * 
	 * @param length 数据源List的长度
	 * @return
	 */
	public static List<List<Integer>> status(Integer length) {
		if (length < 2) {
			return null;
		}

		List<List<Integer>> statusList = new ArrayList<>();
		List<Integer> tmp = new ArrayList<>();
		statusList.add(tmp);
		for (int i = 1; i <= length; i++) {
			List<List<Integer>> statusListTmp = new ArrayList<>(statusList);
			statusList = new ArrayList<>();
			for (List<Integer> list : statusListTmp) {
				List<Integer> list0 = new ArrayList<>(list);
				list0.add(0);
				List<Integer> list1 = new ArrayList<>(list);
				list1.add(1);
				statusList.add(list0);
				statusList.add(list1);
			}
		}
		return statusList;
	}

	/**
	 * 穷举，计算最接近的值
	 * 
	 * @param statusList
	 * @param list
	 * @param target
	 */
	private static void caclClose(List<List<Integer>> statusList, List<Double> list, Double target) {
		List<Integer> finalStatus = new ArrayList<>();
		double min = target;
		for (List<Integer> status : statusList) {
			double sum = 0d;
			for (int i = 0; i < status.size(); i++) {
				sum += status.get(i) * list.get(i);
			}
			if (min > Math.abs(target - sum)) {
				finalStatus = new ArrayList<>(status);
				min = Math.abs(target - sum);
			}
		}
		System.out.println();
		System.out.println("Result:");
		double total = 0d;
		for (int i = 0; i < finalStatus.size(); i++) {
			System.out.print(finalStatus.get(i) + "    ");
		}
		System.out.println();
		for (int i = 0; i < finalStatus.size(); i++) {
			System.out.print(finalStatus.get(i) * list.get(i) + "    ");
			total += finalStatus.get(i) * list.get(i);
		}
		System.out.println();
		System.out.print(total + " = ");
		for (int i = 0; i < finalStatus.size(); i++) {
			if (i == finalStatus.size() - 1) {
				System.out.print(finalStatus.get(i) + "" + "*" + list.get(i));
			} else {
				System.out.print(finalStatus.get(i) + "" + "*" + list.get(i) + " + ");
			}
		}
		System.out.println();

	}

}
