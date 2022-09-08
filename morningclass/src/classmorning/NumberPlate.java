package classmorning;



public class NumberPlate {
	public static boolean NumbPlate(String str, int n)
	{
		String details[] =	str.split("-");
		
		for(int i = 0; i < details.length; i++) {
			if(i%2==0) {
				for(int j = 0; j < details[i].length(); j++){    
					if (details[i].charAt(j) < 'A' || details[i].charAt(j) > 'Z') {
				    return false;
					}
	            }
			}
			if(i%2!=0) {
			   for(int j = 0; j < details[i].length(); j++){    
				   if (details[i].charAt(j) < '0' || details[i].charAt(j) > '9') {
				   return false;
			       }
               }
		    }
//			if(i==0) {
//				for(int j = 0; j < details[i].length(); j++){    
//					if (details[i].charAt(j) < 'A' || details[i].charAt(j) > 'Z') {
//				    return false;
//					}
//	            }
//			}
//			if(i==1) {
//			   for(int j = 0; j < details[i].length(); j++){    
//				   if (details[i].charAt(j) < '0' || details[i].charAt(j) > '9') {
//				   return false;
//			       }
//               }
//		    }
//			if(i==2) {
//				for(int j = 0; j < details[i].length(); j++){    
//					if (details[i].charAt(j) < 'A' || details[i].charAt(j) > 'Z') {
//				    return false;
//					}
//	            }
//			}
//			if(i==3) {
//				 for(int j = 0; j < details[i].length(); j++){    
//					 if (details[i].charAt(j) < '0' || details[i].charAt(j) > '9') {
//					 return false;
//				      }
//	             }
//			}
		}	
		        return true;
	}	   

	// Driver Code
	public static void main(String args[])
	{
		// Given string str
		String str = "PB-20-BC-5548";
		int len = str.length();

		// Function Call
		System.out.println(NumbPlate(str, len));
	}
}

