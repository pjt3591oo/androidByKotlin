const express = require('express')
const app = express()

const users = [
  {id: 1, email: "test1@test.com", password: "test1", isActive: true},
  {id: 2, email: "test2@test.com", password: "test2", isActive: true},
  {id: 3, email: "test3@test.com", password: "test3", isActive: true},
  {id: 4, email: "test4@test.com", password: "test4", isActive: true},
  {id: 5, email: "test5@test.com", password: "test5", isActive: true},
]

app.use(express.json()); 
app.use(express.urlencoded( {extended : false } ));

app.get('/users', (req, res) => {
  return res.json({
    errorCode: 0,
    users
  })
})

app.post('/user', (req, res) => {
  let { id, email, password } = req.body
  let user = { id, email, password, isActive: true} 
  users.push(user)
  return res.status(201).json({
    errorCode: 0,
    user
  })
})

app.listen(3000, () => {
  console.log('server running')
})