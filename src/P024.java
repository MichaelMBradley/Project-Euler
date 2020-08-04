//Lexicographic permutations
/*
 Look, I know what you're thinking.
 I know I should have used recursion, but it's late at night and I just couldn't fix the bugs.
 I give you full permission to laugh at me.
 
 I really need to fix this soon.
 */
public class P024 {
	public static void main(String[] args) {
		String[] n = new String[10];
		boolean[] u = new boolean[10];
		String s;
		int z = 0;
		
		for(int k = 0; k < 10; k++) {
			n[k] = String.valueOf(k);
			u[k] = false;
		}
		
		for(int a = 0; a < 10; a++) {
			s = n[a];
			u[a] = true;
			for(int b = 0; b < 10; b++) {
				if(!u[b]) {
					s+=n[b];
					u[b] = true;
					for(int c = 0; c < 10; c++) {
						if(!u[c]) {
							s+=n[c];
							u[c] = true;
							for(int d = 0; d < 10; d++) {
								if(!u[d]) {
									s+=n[d];
									u[d] = true;
									for(int e = 0; e < 10; e++) {
										if(!u[e]) {
											s+=n[e];
											u[e] = true;
											for(int f = 0; f < 10; f++) {
												if(!u[f]) {
													s+=n[f];
													u[f] = true;
													for(int g = 0; g < 10; g++) {
														if(!u[g]) {
															s+=n[g];
															u[g] = true;
															for(int h = 0; h < 10; h++) {
																if(!u[h]) {
																	s+=n[h];
																	u[h] = true;
																	for(int i = 0; i < 10; i++) {
																		if(!u[i]) {
																			s+=n[i];
																			u[i] = true;
																			for(int j = 0; j < 10; j++) {
																				if(!u[j]) {
																					z++;
																					if(z==1000000) {
																						System.out.print(s + n[j]);
																					}
																				}
																			}
																			u[i] = false;
																			s = s.substring(0, s.length()-1);
																		}
																	}
																	u[h] = false;
																	s = s.substring(0, s.length()-1);
																}
															}
															u[g] = false;
															s = s.substring(0, s.length()-1);
														}
													}
													u[f] = false;
													s = s.substring(0, s.length()-1);
												}
											}
											u[e] = false;
											s = s.substring(0, s.length()-1);
										}
									}
									u[d] = false;
									s = s.substring(0, s.length()-1);
								}
							}
							u[c] = false;
							s = s.substring(0, s.length()-1);
						}
					}
					u[b] = false;
					s = s.substring(0, s.length()-1);
				}
			}
			u[a] = false;
		}
	}
}
//2783915460