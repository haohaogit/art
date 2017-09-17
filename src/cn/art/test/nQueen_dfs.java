package cn.art.test;

import java.util.Scanner;

public class nQueen_dfs {
	private static int n;
	private static int num_tree;
	private static boolean flag;
	private static boolean isSearch;
	private static int[][] queen; 
	private static int p;
	static{
		flag = false;
		isSearch = false;
		num_tree = 0;
		p = 15;     //皇后的数量
		/*queen = new int[15][16];
		for(int i = 0;i<15;i++){
			for(int j = 0;j<=15;j++)
				queen[i][j] = 0;
		}*/
		//queen[3][4] = 2;
		//queen[3][8] = 4;
		//queen[5][5] = 2;
		//queen[5][8] = 5;    //在数组末位记录该行是否有数及树的位置
		//print();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S=new Scanner(System.in);
		System.out.print("Enter no. of Queens: ");
        n = S.nextInt();
        queen = new int[20][21];
		for(int i = 0;i<n;i++){
			for(int j = 0;j<=n;j++)
				queen[i][j] = 0;
		}
		//print();
        solveNQueens(n);
        
        /*for(int i = 0;i<n;i++){
			for(int j = 0;j<=n;j++){
				System.out.print(queen[i][j]);
			}
			System.out.println();
				
		}*/

        
		
	}
			 public static void solveNQueens(int n) {
			      
			        if(n <= 0){
			            return ;
			        }
			        
			        //int []queen = new int[n + 1];
			        for(int i = 0; i < n ; i++){
			        	//判断该位置是否有树，没有树则开始搜索，有树的话换到下一列
			        	if(queen[0][i]==0){
			        		//System.out.println("row= "+0+" col= "+i);
			        		queen[0][i] = 1;   //从第一行第一列开始搜索
			        		num_tree++;
			        		//如果该行没有树，则搜索下一行（从第一列开始）
			        		if(queen[0][n]==0){ 
			        			dfs(queen,1,n);
			        		}else{//该行有树，则继续搜索该行
			        			i+=2;
			        			dfs(queen,0,n);
			        		}
			        		num_tree--;
			        		queen[0][i] = 0;   //从第一行第一列开始搜索
			        	}
			        }
			       
			    }
			    
			    public static void dfs(int queen[][], int row, int n) {
			    	//如果找到解了，则停止搜索
			    	if(flag) return;
			    	if(row>=n) return;  //行是否越界
			    	//if(col>=n) return;
			    	
			       /* if(line == n+1){
			            String[] tempArr = new String[n];
			            for(int i = 1; i < n+1; i++){
			            	StringBuffer sb = new StringBuffer();
			            	for (int j = 1; j < n+1; j++) {
								if (queen[i] == j) {
									sb.append("Q");
								}else {
									sb.append(".");
								}
							}
			            	tempArr[i-1] = sb.toString();
			            }
			            list.add(tempArr);
			            return;
			        }*/
			    	
			    	
			        for(int i = 0; i < n; i++){
			        	
			            if((queen[row][i]==0)&&valid(row, i, queen)){
			            	//System.out.println("row= "+row+" col= "+i);
			                queen[row][i] = 1;
			                num_tree++;  //找到一个皇后位置
			                if(num_tree==n) {
			                	flag = true;   //如果找到一个解决方案，则置搜索判断条件为真
			                	print();
			                }
			                if(queen[row][n]!=0){   //该行有树,继续该行搜索，否则换下一行搜索
			                	if(isSearch){  //在该行搜索过，就换行
			                		isSearch = false;
			                		dfs(queen, row+1, n);
			                		
			                	}
			                	if(i==n-1){  //如果到列的边界了，则换行
			                		dfs(queen, row+1, n);
			                	}else{
			                		isSearch = true;
			                		dfs(queen, row, n);
			                		
			                	}
			                	
			                }else{
			                	dfs(queen ,row+1, n);
			                }
			                num_tree--;  
			                queen[row][i] = 0;
			               
			            }
			        }
			    }
			    public static boolean valid(int row, int col, int [][]queen) {
			    	if(queen[row][n]!=0){ //如果该行有树  queen[row][8]会记录树的位置
			    		//int posT = queen[row][8];
			    		if(isExistQ(row,n)){ //该行是否有皇后
			    			//判断位置是否和已有的皇后冲突
			    			if(!rowIsOk(row, col)){
			    				return false;
			    			}else{
			    				//不同测的话，判断是否该列、左上、右上是否满足存放条件
			    				if(left(row, col)&&right(row, col)&&top(row, col)){
			    					return true;
			    				}else{
			    					return false;
			    				}
			    			}
			    		}else{   //该行没有皇后,直接判断是否该列、左上、右上是否满足存放条件
			    			if(left(row-1, col-1)&&right(row-1, col+1)&&top(row-1, col)){
		    					return true;
		    				}else{
		    					return false;
		    				}
			    		}
			    	}else{  //该行没有树，直接判断是否该列、左上、右上是否满足存放条件
			    		if(isExistQ(row,n)){  //该行是否有皇后,已有皇后了则不能再放置了
		    					return false;
			    		}else{
			    			if(left(row-1, col-1)&&right(row-1, col+1)&&top(row-1, col)){
		    					return true;
		    				}else{
		    					return false;
		    				}
			    		}
			    		
			    	}

			    }
			    public static boolean isExistQ(int row,int n) {
			    	int k=0;   //记录皇后的位置，没有的话返回0
			    	for (int i = 0;i<n;i++) {
						if(queen[row][i]==1) return true;
						
					}
			    	//System.out.println("k ="+k);
			        return false;
			    }
			    public static boolean left(int row,int col) {
			    	while(col>=0&&row>=0){
			    		if(queen[row][col]==1){  //遇到皇后，则表明该位置不能放
			    			return false;
			    		}
			    		if(queen[row][col]==2){  //遇到树，则表明该位置能放
			    			return true;
			    		}
			    		row--;
			    		col--;
			    	}
			        return true;
			    }
			    public static boolean right(int row,int col) {
			    	while(col<n&&row>=0){
			    		if(queen[row][col]==1){  //遇到皇后，则表明该位置不能放
			    			return false;
			    		}
			    		if(queen[row][col]==2){  //遇到树，则表明该位置能放
			    			return true;
			    		}
			    		row--;
			    		col++;
			    	}
			        return true;
			    }
			    public static boolean top(int row,int col) {
			    	while(col>=0&&row>=0){
			    		if(queen[row][col]==1){  //遇到皇后，则表明该位置不能放
			    			return false;
			    		}
			    		if(queen[row][col]==2){  //遇到树，则表明该位置能放
			    			return true;
			    		}
			    		row--;
			    	}
			        return true;
			    }
			    public static boolean rowIsOk(int row,int col) {
			    	for (int i = 0; i < col; i++) {
						if(queen[row][i]==1) return false;
					}
			    	for (int i = col+1; i < n; i++) {
						if(queen[row][i]==1) return false;
					}
			        return true;
			    }
			    public static  void print() {
			    	for(int i = 0;i<n;i++){
						for(int j = 0;j<n;j++){
							System.out.print(queen[i][j]);
						}
						System.out.println();
							
					}
				
				}


		}
