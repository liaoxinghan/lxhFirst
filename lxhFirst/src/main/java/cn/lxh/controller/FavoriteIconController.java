package cn.lxh.controller;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.lxh.common.JsonRestut;

/**
* <p>Title: FavoriteIconController</p>
* <p>Description: </p>
* <p>Company: zhph</p> 
* @author liaoxinghan
* @date 2016-12-29
*/
@Controller
@RequestMapping("/click")
public class FavoriteIconController {

	@RequestMapping("/add")
	public @ResponseBody
	JsonRestut add(HttpServletRequest request) {
		return null;
	};

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			final int flag = i;
			new Thread(new Runnable() {
				@Override
				public void run() {
					doSomething(flag);
				}
			}).start();
		}
	}

	public static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	public static ReadLock readLock = lock.readLock();
	public static WriteLock writeLock = lock.writeLock();

	public static void doSomething(final int flag) {

		readLock.lock();
		try {
			System.out.println(Thread.currentThread() + ":进入读锁");
			if (flag % 2 == 0) {
				writeLock.lock();
				try {
					System.out.println(Thread.currentThread() + ":进入写锁------------------------------");
				} catch (Exception e) {
					// TODO: handle exception
				} finally {
					writeLock.unlock();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			readLock.unlock();
		}
	}

}
