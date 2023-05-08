import axios from "axios";

const Adminurl = "http://localhost:8080/admin";

const EmployeeService = {
  
  getBranch: async () => {
    const response = await axios.get(Adminurl + "/getBranch");
    return response.data;
  },
  getBranchbycode: async (id) => {
    const response = await axios.get(`${Adminurl}/branchbycode/${id}`);
    return response.data;
  },
  postBranch: async (data) => {
    const response = await axios.post(Adminurl + "/addBranch", data);
    return response.data;
  },
  putBranch: async (data) => {
    const response = await axios.put(`${Adminurl}/modifyBranch`, data);
    return response.data;
  },



  getEmployee: async () =>{
    const response = await axios.get(Adminurl + "/getEmployee");
    return response.data;
  },
  postEmployee: async (data) => {
    const response = await axios.post(Adminurl + "/addEmployee", data);
    return response.data;
  },
  getEmployeeByCode: async (id) => {
    const response = await axios.get(`${Adminurl}/Employee/${id}`);
    return response.data;
  },
  putEmployee: async (data) => {
    const response = await axios.put(`${Adminurl}/modifyEmployee`, data);
    return response.data;
  },
  getCountry: async () => {
    const response = await axios.get(Adminurl + "/viewcountry");
    return response.data;
  },
  getStateById: async (id) => {
    const response = await axios.get(`${Adminurl}/statebyid/${id}`);
    return response.data;
  },
  getCityById: async (id) => {
    const response = await axios.get(`${Adminurl}/citybyid/${id}`);
    return response.data;
  },
  getLocationById: async (id) => {
    const response = await axios.get(`${Adminurl}/locationbyid/${id}`);
    return response.data;
  },
  postCountry: async (data) => {
    const response = await axios.post(Adminurl + "/addCountry", data);
    return response.data;
  },
  postState: async (data) => {
    const response = await axios.post(Adminurl + "/addState", data);
    return response.data;
  },
  postCity: async (data) => {
    const response = await axios.post(Adminurl + "/addCity", data);
    return response.data;
  },
  postLocation: async (data) => {
    const response = await axios.post(Adminurl + "/addLocation", data);
    return response.data;
  },


  getRole: async () => {
    const response = await axios.get(Adminurl + "/getRole");
    return response.data;
  },
  getRolebycode: async (id) => {
    const response = await axios.get(`${Adminurl}/Role/${id}`);
    return response.data;
  },
  getLocationByLocationId: async (id) => {
    const response = await axios.get(`${Adminurl}/locationbylocationid/${id}`);
    return response.data;
  },
  getBankbyId: async (id) => {
    const response = await axios.get(`${Adminurl}/Bank/${id}`);
    return response.data;
  },
  postBank: async (data) => {
    const response = await axios.post(Adminurl + "/addBank", data);
    return response.data;
  },
};
export default EmployeeService;
