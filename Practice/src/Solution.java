
class Solution{
    public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        ArrayList obj = new ArrayList();
        
        for(int i=0 ; i<v1.length;i++)
        {
            for(int j=0 ;j<v2.length; j++)
            {
                if(v1[i]==v2[j])
                {
                    obj.add(v1[i]);
                }
            }
        }
        
    }
}