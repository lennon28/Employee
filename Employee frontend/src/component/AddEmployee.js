
import "bootstrap/dist/css/bootstrap.css";
import "./employee.css"
import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

import EmployeeService from "../Service/Service";
import Address from "./Address";
import Contact from "./Contact";
import Bank from "./Bank";
import Role from "./Role";
import Mobile from "./Mobile";
import "./Tabs.css"


// import Tabs from "../Tabs";


function AddEmployee() {

  const [toggleState, setToggleState] = useState(1);
  const[  bankdetails,setbankdetails] = useState({})
  


  const toggleTab = (index) => {
    setToggleState(index);
  };
  const nav = useNavigate();

  const [Employee, setEmployee] = useState(
  {
      bankBean :{
        beneficiary_NAME_1 : "",

      },
      branchBean: {
        branch_CODE: "",
        branch_NAME: ""
      },
      em_TXN_ID: "",
      em_NAME_INFO: "",
      em_START_DATE:  new Date().toISOString().slice(0, 10),
      em_END_DATE:  "2055-11-25",
      imei_NO2: "",
      imei_NO1: "",
      em_STATUS_IND: "yes",
      em_EMPLOYEE_CODE: ""
  }
  );
  
  const [branchName, setBranchName] = useState([]);

  const[locationid,setlocationid] = useState()
  const[roleid,setroleid] = useState()
  // const  [data, setdata] =  useState([])
  const  [branchid, setbranchid] =  useState()
  // const  [countryid, setcountryid] =  useState()
  // const  [states, setstates] =  useState([])
  // const  [stateid, setstateid] =  useState()
  // const  [City, setCity] =  useState([])
  // const  [Cityid,setcityid] = useState()
  // const  [location,setlocation]=useState([])
//    useEffect(()=>{
//     EmployeeService.getCountry().then(res=>setdata(res))
//    },[])
   
 
//     useEffect(()=>{
//    if(countryid){
//     EmployeeService.getStateById(countryid).then(res=>setstates(res))
//    }
   
//      },[countryid])
 
//      useEffect(()=>{
//          if(stateid){
//           EmployeeService.getCityById(stateid).then(res=>setCity(res))
//          }
         
//            },[stateid])

//            useEffect(()=>{
//             if(Cityid){
//              EmployeeService.getLocationById(Cityid).then(res=>setlocation(res))
//             }
            
//               },[Cityid])
        

           
 
//  const hanleselect1=(e)=>{
//     setcountryid(e.target.value)
//     setstates([])
//     setCity([])
//  }
//  const hanleselect2=(e)=>{
//      setstateid(e.target.value)
//      setCity([])
//   }
//   const hanleselect3=(e)=>{
//     setcityid(e.target.value)
//     setlocation([])
//  }

useEffect(() => {
  EmployeeService.getBranch().then((res) => {
    setBranchName(res);
  });
}, []);

useEffect(() => {
  if(branchid){
    EmployeeService.getBranchbycode(branchid).then((res) => setEmployee({
      ...Employee ,
      branchBean: {
        branch_CODE: res.branch_CODE,
        branch_NAME: res.branch_NAME,
      }
    })  
    
  );
  
 
}}, [branchid]);

useEffect(() => {
if(locationid){

EmployeeService.getLocationByLocationId(locationid).then(res=>{
  setEmployee({...Employee,location: (res)})


})
}

  }, [locationid]);


  useEffect(() => {
    if(roleid){
    
    EmployeeService. getRolebycode(roleid).then(res=>{
      setEmployee({...Employee,roleBean: (res)})
    
    
    })
    }
    
      }, [roleid]);
  
 const hanleselect4=(e)=>{
  setbranchid(e.target.value)
}

 const handlechange=(e)=>{
  setEmployee({...Employee,[e.target.id]:(e.target.value)})
 }
 
 
  const handleSubmit = () => {
 
   
  
    console.log(Employee); // Add this line
  
    EmployeeService.postEmployee(Employee).then(res => alert("Added"));
  };
 
  // const handlesubmit = () => {
  //   selectBranch === "--select Branch--" ?  <h3>Enter Branch name</h3> : nav("/addemployee");
  // };
  const handlestus = (e) => {
    if (e.target.checked) {
      setEmployee({
        ...Employee,
        [e.target.id]: "yes",
        em_END_DATE: "2055-11-25" // Set the fixed end date
      });
    } else {
      setEmployee({
        ...Employee,
        [e.target.id]: "No",
        em_END_DATE: new Date().toISOString().slice(0, 10) // Set the current date
      });
    }
  };
  

const handlelocation =(e)=>{
 setlocationid(e.target.value)
}

const handledetails=(e)=>{
  setEmployee({...Employee,bankBean: {...(Employee.bankBean) ,[e.target.id]: (e.target.value)}})
}
console.log(bankdetails)
const handlerole =(e)=>{
  setroleid(e.target.value)
}
  return (
    
    <div class="container">
      
     
      <div class="row">
  <div class="form-group col">
    <label for="branchName">Branch Name:</label>
    {/* <input type="text" class="form-control" id="branchName" placeholder="Enter branch name" /> */}
    <select  onChange={hanleselect4}> 
              <option></option>
              {branchName.map((item) => {
                return (
                  <option value={item.branch_CODE}>{item.branch_NAME}</option>
                );
              })}
            </select>
  </div>
  <div class="form-group col">
    <label for="empCode">Emp Code:</label>
    <input type="text" class="form-control" id="em_EMPLOYEE_CODE" placeholder="Enter employee code" onChange={handlechange}/>
  </div>
  <div class="form-group col">
    <label for="empName">Emp Name:</label>
    <input type="text" class="form-control" id="em_NAME_INFO" placeholder="Enter employee name"  onChange={handlechange}/>
  </div>
  <div class="form-group col">
    <button type='submit' class="btn btn-primary" >GO</button>
  </div>
  <div class="form-group col">
    <button type='submit' class="btn btn-primary" onClick={handleSubmit}>SAVE</button>
  </div>
</div>


<div class="form-row">
  <div class="col-md-4 form-group">
    <label for="startDate">Start Date:</label>
    <input type="date"   class="form-control"   id="em_START_DATE" value={Employee.em_START_DATE} onChange={handlechange}  disabled/>
  </div>
  <div class="col-md-4 form-group">
    <label for="endDate">End Date:</label>
    <input type="date" class="form-control"  id="em_END_DATE"   value={Employee.em_END_DATE} onChange={handlechange}  disabled />
  </div>
  <div class="col-md-4 form-group">
    <label for="status">Status:</label>
    <div class="checkbox">
      <label><input type="checkbox" id="em_STATUS_IND" checked={Employee.em_STATUS_IND === "yes"} onChange={handlestus}/></label>
    </div>
  </div>
  

</div>
<div>
      {/* <div style={head}>
              <h5 style={{marginLeft:'35px'}}>Profile 03</h5>
              <p style={{marginRight:'35px',wordSpacing:'5px'}}> <AiIcons.AiFillHome/> <SlIcons.SlArrowRight style={{fontSize:'15px'}}/>Account Profile <SlIcons.SlArrowRight style={{fontSize:'15px'}}/> Profile 03</p>
          </div> */}
      </div>
      <div className="container">
        <div className="bloc-tabs">
          <button
            className={toggleState === 1 ? "tabs active-tabs" : "tabs"}
            onClick={() => toggleTab(1)}
          >
            Address
          </button>
          <button
            className={toggleState === 2 ? "tabs active-tabs" : "tabs"}
            onClick={() => toggleTab(2)}
          >
            Contact Info
          </button>
          <button
            className={toggleState === 3 ? "tabs active-tabs" : "tabs"}
            onClick={() => toggleTab(3)}
          >
            Bank Info
          </button>
          <button
            className={toggleState === 4 ? "tabs active-tabs" : "tabs"}
            onClick={() => toggleTab(4)}
          >
            Role Info
          </button>

          <button
            className={toggleState === 5 ? "tabs active-tabs" : "tabs"}
            onClick={() => toggleTab(5)}
          >
            Mobile Registration 
          </button>
        </div>
  
        <div className="content-tabs">
          <div
            className={toggleState === 1 ? "content  active-content" : "content"}
          >
            <h2></h2>
            
            <Address handlechange={handlechange} handlelocation={handlelocation}/>
            
          </div>
  
          <div
            className={toggleState === 2 ? "content  active-content" : "content"}
          >
            
            <Contact handlechange={handlechange}/>
               {/* <Billing/>
              <Table/> */}
          </div>
  
          <div
            className={toggleState === 3 ? "content  active-content" : "content"}
          >
            <h2></h2>
            

            <Bank  handledetails={handledetails}/>
              {/* <ChangePassword/>
              <DeleteAccount/>
               */}
          </div>
      
         <div
            className={toggleState === 4 ? "content  active-content" : "content"}
          >
            
            <Role handlechange={handlechange} handlerole={handlerole}/>
            {/* <Checkbox/>
            <Last/> */}
           
           
          </div>


          <div
            className={toggleState === 5 ? "content  active-content" : "content"}
          >
           
            <Mobile handlechange={handlechange}/>
              {/* <ChangePassword/>
              <DeleteAccount/>
               */}
          </div>
  
          
        </div>
      </div>
  



{/* <Tabs/> */}
{/* <Address handlechange={handlechange} handlelocation={handlelocation}/> */}

        









     
        {/* <div class="panel panel-default">
          <div class="panel-heading"><b>Address</b></div>
          <div class="panel-body">
          <div className="form-group">
      <label for="addressType">Address Type</label>
      <input type="text" className="form-control" id="addressType" />
    </div>
    <div className="">
      <label for="address">Address</label>
      <input type="text" className="form-control" id="address" />
    </div>
    <div className="">
      <label for="country">Country</label>
      <select className="form-select" id="country" onChange={hanleselect1}>
        <option>-- Select Country --</option>
        {data.map(c => (
          <option value={c.countryid}>{c.countryname}</option>
        ))}
      </select>
    </div>
    <div className="">
      <label for="state">State</label>
      <select className="form-select" id="state" onChange={hanleselect2}>
        <option>-- Select State --</option>
        {states.map(s => (
          <option value={s.stateid}>{s.statename}</option>
        ))}
      </select>
    </div>
    <div className="">
      <label for="city">City</label>
      <select className="form-control" id="city" onChange={hanleselect3}>
        <option>-- Select City --</option>
        {City.map(c => (
          <option value={c.cityid}>{c.cityname}</option>
        ))}
      </select>
    </div>

    <div className="">
      <label for="location">Location</label>
      <select className="form-control" id="location">
        <option>--SELECT--</option>
        {location.map(l => (
          <option value={l.locationid}>{l.locationname}</option>
        ))}
      </select>
    </div>
        <div class="form-group">
          <label for="pincode">Pin Code:</label>
          <input type="text" class="form-control" id="pincode" placeholder="Enter pin code" />
        </div>
      </div>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
     */}
  
</div>


    
  )
}

export default AddEmployee
