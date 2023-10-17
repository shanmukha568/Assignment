const prompt=require("prompt-sync")({sigint:true});
let str=prompt();


let sam="";
let res="";
for(let i=0;i<str.length;i++)
{
    if(str.charAt(i)==' ' && str. charAt(i+1)!=' ')
    {
        res=res+(reverse(sam)+" ");
        sam="";
    }
    else if(str.charAt(i)!=' ')
    {
        sam=sam+str.charAt(i);
    }
}
res=res+(reverse(sam));
console.log(res);


function reverse(str)
{

    let res="";
   for(let i=str.length-1;i>=0;i--)
   {
     res+= str[i];
   }
   return res;
}