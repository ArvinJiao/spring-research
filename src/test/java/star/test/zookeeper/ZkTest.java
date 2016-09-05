package star.test.zookeeper;

import java.io.IOException;
import java.util.List;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.ZooKeeper.States;
import org.junit.Test;

public class ZkTest {

	@Test
	public void test0() throws IOException, KeeperException, InterruptedException {
		ZooKeeper zk = new ZooKeeper("192.168.54.182:2181,192.168.54.182:2182,192.168.54.182:2183", 6000, new Watcher() {
			@Override
			public void process(WatchedEvent arg0) {
				System.out.println("watch:" + arg0.getPath());
				System.out.println("watch:" + arg0.getState());
			}

		});
		

		//zk.create("/n1", "cup".getBytes(), Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
		// 创建一个子目录节点
		//zk.create("/testRootPath/testChildPathOne", "testChildDataOne".getBytes(), Ids.OPEN_ACL_UNSAFE,
		//	CreateMode.PERSISTENT);
		
		//byte[] data = zk.getData("/n1", false, null);
		//System.out.println(new String(data));
		
		String seq = zk.create("/zk/123/eop-app", "cat".getBytes(), Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
		System.out.println("seq:" + seq);
		List<String> children = zk.getChildren("/zoo", new Watcher() {
			@Override
			public void process(WatchedEvent arg0) {
				System.out.println("watch0:" + arg0.getPath());
			}

		});
		
		System.out.println("children:" + children);
		//zk.delete("/zoo/cat", -1);
	}
	
	public void test() throws IOException{
		ZooKeeper zk = new ZooKeeper("192.168.63.152:2181", 6000, new Watcher() {
			@Override
			public void process(WatchedEvent arg0) {
				System.out.println("watch:" + arg0);
			}
		});
		States state = zk.getState();
		System.out.println("state:"+state);

	}
}
