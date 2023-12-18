import logo from './logo.svg';
import './App.css';
import {Component} from "react";

class App extends Component {
    state = {
        customer: {
            accounts: []
        }
    };

    async componentDidMount() {
        const response = await fetch('/v1/customer/ace68c73-a662-4e91-9bfb-16ed26b2f973');
        const body = await response.json();
        this.setState({customer: body});
    }

    render() {
        const {customer} = this.state;
        return (
            <div className="App">
                <header className="App-header">
                    <img src={logo} className="App-logo" alt="logo"/>
                    <div className="App-intro">
                        <h2>Customer</h2>
                        <div key={customer.id}>
                            {customer.name} {customer.surname}
                            {customer.accounts.map(account =>
                                    <div key={account.id}>
                                        <p> Accounts: {account.id}, {account.balance}, {account.creationDate}</p>
                                        <p>
                                            {account.transactions.map(transaction =>
                                                    <span key={transaction.id}>
                                                    Transactions: {transaction.id},
                                                        {transaction.amount},
                                                        {transaction.transactionDate}
                                                        {transaction.transactionType}
                                                    </span>
                                            )}
                                        </p>
                                    </div>
                            )}
                        </div>
                    </div>
                </header>
            </div>
        );
    }

}

export default App;

