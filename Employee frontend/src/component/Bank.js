import React from 'react'

function Bank(props) {
  return (
    <div>
      <div><h3>Primary Bank Details</h3></div>

      <div className="">
        <label htmlFor="SelectedBank1">Selected Bank 1</label>
        <input type="checkbox" id="SelectedBank1" />
      </div>

      <div className='form-flex'>
        <div className="column">
          <div className="form-group">
            <label htmlFor="Benname1">Beneficiary Name 1</label>
            <input type="text" className="form-control"  id="beneficiary_NAME_1" onChange={props.handledetails} />
          </div>
          <div className="form-group">
            <label htmlFor="BankBranch1">Bank Branch 1</label>
            <input type="text" className="form-control" id="bank_BRANCH_1" onChange={props.handledetails}/>
          </div>
          <div className="form-group">
            <label htmlFor="IFSCcode1">IFSC Code 1:</label>
            <input type="text" className="form-control" id="ifsc_CODE_1" onChange={props.handledetails}/>
          </div>
        </div>
        <div className="column">
          <div className="form-group">
            <label htmlFor="NameoftheBank1">Name of the Bank 1:</label>
            <input type="text" className="form-control" id="bank_NAME_1" onChange={props.handledetails} />
          </div>
          <div className="form-group">
            <label htmlFor="BankAccountNumber1">Bank Account Number 1:</label>
            <input type="text" className="form-control" id="account_NO_1"  onChange={props.handledetails}/>
          </div>
          <div className="form-group">
            <label htmlFor="BankAccountType1">Bank Account Type 1:</label>
            <select id= "account_TYPE_1" onChange={props.handledetails}>
              <option value="Savings">Savings</option>
              <option value="Current">Current</option>
            </select>
          </div>
        </div>
      </div>



<div> <h3> Additional Bank Details</h3></div>
<div className="">
        <label htmlFor="SelectedBank1">Selected Bank 2</label>
        <input type="checkbox" id="SelectedBank1" onChange={props.handledetails} />
      </div>

      <div className='form-flex'>
        <div className="column">
          <div className="form-group">
            <label htmlFor="Benname1">Beneficiary Name 2</label>
            <input type="text" className="form-control" id= "beneficiary_NAME_2" onChange={props.handledetails} />
          </div>
          <div className="form-group">
            <label htmlFor="BankBranch1">Bank Branch 2</label>
            <input type="text" className="form-control" id="bank_BRANCH_2" onChange={props.handledetails}/>
          </div>
          <div className="form-group">
            <label htmlFor="IFSCcode1">IFSC Code 2:</label>
            <input type="text" className="form-control" id="ifsc_CODE_2" onChange={props.handledetails}/>
          </div>
        </div>
        <div className="column">
          <div className="form-group">
            <label htmlFor="NameoftheBank1">Name of the Bank 2:</label>
            <input type="text" className="form-control" id="bank_NAME_2" onChange={props.handledetails}/>
          </div>
          <div className="form-group">
            <label htmlFor="BankAccountNumber1">Bank Account Number 2:</label>
            <input type="text" className="form-control" id="account_NO_2" onChange={props.handledetails}/>
          </div>
          <div className="form-group">
            <label htmlFor="BankAccountType1">Bank Account Type 2:</label>
            <select id= "account_TYPE_2" onChange={props.handledetails}>
              <option value="Savings">Savings</option>
              <option value="Current">Current</option>
            </select>
          </div>
        </div>




    </div>
    </div>
  )
}

export default Bank
