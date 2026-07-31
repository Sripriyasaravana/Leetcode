class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String>set=new HashSet<>();
        int row=0;
        int col=0;
        set.add("0,0");
        boolean found=false;
        for(int i=0;i<path.length();i++){
            char ch=path.charAt(i);
            if(ch=='N'){
                row--;
            }
            else if(ch=='S'){
                row++;
            }
            else if(ch=='E'){
                col++;
            }
            else if(ch=='W'){
                col--;
            }
            String pos=row+","+col;
            if(set.contains(pos)){
                found=true;
                break;
            }
            set.add(pos);
        }
        return(found);
    }
}