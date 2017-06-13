package ustc.maomao.patterns.observer;

import ustc.maomao.patterns.support.PatternTester;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         观察者模式测试器
 * 
 */
public class ObserverTester implements PatternTester {

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.support.PatternTester#test()
	 */
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
		NewsPublisher publisher=new NewsPublisher();
		NewsObserver email1=new EmailObserver();
		NewsObserver email2=new EmailObserver();
		NewsObserver sms1=new SMSObserver();
		
		publisher.addObserver(sms1);
		publisher.addObserver(email1);
		publisher.addObserver(email2);
		
		publisher.generateNews();
	}

}
