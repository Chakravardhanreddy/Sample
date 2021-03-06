package com.nttdata.Assignment1;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;





public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,Customer> hash=new HashMap<>();
		
		hash.put(1, new Customer(111,"chakri","abc","delhi",1000));
		hash.put(3, new Customer(122,"shaw","def","delhi",7000));
		hash.put(null, new Customer(113,"dhawan","swg","mumbai",9000));
		hash.put(5, new Customer(117,"shreyas","gfg","mumbai",8000));
		hash.put(4, new Customer(110,"rishab","vhh","banglore",6000));
		hash.put(7, new Customer(123,"hetmyer","ssd","banglore",5000));
		hash.put(9, new Customer(182,"stoinis","shv","banglore",4000));
		hash.put(8, new Customer(13,"axar","zsa","chennai",12000));
		hash.put(11, new Customer(191,"rabada","jut","chennai",13000));
		hash.put(10, new Customer(141,"ashwin","hjn","hyderabad",16000));
		hash.put(15, new Customer(171,"nortje","csa","hyderabad",17000));
		hash.put(14, new Customer(121,"tushar","dfe","hyderabad",19000));
		
		
		/*for(Entry<Integer,Customer>m :hash.entrySet())
		{
			System.out.println("Key is "+m.getKey()+"\t"+"value is"+m.getValue());
		}
		*/
		
		Map.Entry<Integer,Customer> c=hash.entrySet().stream().max((p1,p2)->p1.getValue().price>p2.getValue().price?1:-1).get();
		System.out.println(c);
		Map.Entry<Integer,Customer> d=hash.entrySet().stream().min((p1,p2)->p1.getValue().price<p2.getValue().price?-1:1).get();
		System.out.println(d);
		
		
		Encoder enc=Base64.getEncoder();
		System.out.println("encoded"+enc);
		Decoder dnc=Base64.getDecoder();
		System.out.println("Decoded String"+dnc);
		
		
	
		
	/*long c=hash.entrySet().stream().filter(p->p.getValue().getCity().equals("delhi")).count();
	System.out.println(c);
		*/
		
	}

}
