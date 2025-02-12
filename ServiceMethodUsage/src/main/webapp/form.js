function validateForm()
{
    // alert("Alert form submitted")
    let val=true;
    let nameValue=document.formName.nameName.value;
    // let numberValue=document.forms['fprmName']['phnoName'].value;
    let numberValue=document.formName.phnoName.value;
    let passValue=document.formName.passName.value;
    let passValue1=document.formName.passName1.value;
    let genderSelect=document.querySelector("input[name=genderName]:checked");
    let dropdown=document.getElementById('job').value;

    let x=document.formName.eName.value;
        let atPosition=x.indexOf("@")
        let dotPosition=x.lastIndexOf(".");




    //console.log(nameValue);

    // alert("Alert form submitted")

    if(atPosition <1 || dotPosition < atPosition+2 || dotPosition+2 >=x.length){
        val=false;
        setError('spaneId','Enter a valid email');
    }

    if(nameValue.length<=6 && nameValue.length>=12)
    {

        val=false;
    }

    if(numberValue.length !=10){
        // document.getElementById("errorIdNumber").innerText="Please Enter 10 digits";
        setError('errorIdNumber',"Please Enter 10 digits");
        val=false;
    }

    if(passValue != passValue1){
        // document.getElementById('spanPassId').innerText='Password NoT Matching';
        val=false;
        setError('spanPassId','Password Not Matching');
    }
    if(genderSelect )






    function setError(id,message){
        document.getElementById(id).innerText=message;
        alert("Its an Error")
    }
        // alert("Alert form submitted")
        return val;



}