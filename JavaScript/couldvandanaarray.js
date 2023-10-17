const prompt=require("prompt-sync")({sigint:true});

let arr= prompt().split(' ').map(Number);

let temp=0;

for(let i=0;i<arr.length;i++)
{
    for(let j=i;j<arr.length;j++)
    {
        if(arr[i]<arr[j])
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
console.log(arr);
