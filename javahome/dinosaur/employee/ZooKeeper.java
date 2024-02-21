package employee;

import java.util.Arrays;

public class ZooKeeper extends Def2 implements Rule2 {

	private String[][] zooKeeperList;
	
	public ZooKeeper() {
		zooKeeperList = new String[0][];
	}

	public String[][] getZooKeeperList() {
		return Arrays.copyOf(zooKeeperList, zooKeeperList.length);
	}

	public void setZooKeeperList(String[][] zooKeeperList) {
		this.zooKeeperList = zooKeeperList;
	}
	
	
	
}
