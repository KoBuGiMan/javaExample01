package employee;

import java.util.Arrays;

public class ZooKeeper extends Def2 implements Rule2 {

	private String[][] zooKeeperList;

	public ZooKeeper() {
		zooKeeperList = new String[][] { { "공룡관리원", "정오수", "47", "010-2222-9999", "2동 랩터 출산보조" },
				{ "공룡관리원", "유용재", "27", "010-5555-2222", "1동 공룡들 건강검진" } };
	}

	public String[][] getZooKeeperList() {
		return Arrays.copyOf(zooKeeperList, zooKeeperList.length);
	}

	public void setZooKeeperList(String[][] zooKeeperList) {
		this.zooKeeperList = zooKeeperList;
	}

}
