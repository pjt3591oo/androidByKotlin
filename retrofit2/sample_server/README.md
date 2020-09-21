## 유저목록 조회

* method: `GET`
* path: `/users`
* headers

```json
{}
```

* request

```json
{}
```

* response

```json
{
    "errorCode": "int",
    "users": [{
      "id": "int",
      "email": "string",
      "password": "string",
      "isActive": "boolean"
    }]
}
```

## 유저추가(회원가입)

* method: `POST`
* path: `/user`

* headers

```json
{}
```

* request(body)

```json
{
  "email": "string",
  "password": "string",

}
```

* response

성공적으로 추가됬을 경우 응답코드: `201` 

```json
{
    "errorCode": "int",
    "user": {
      "id": "int",
      "email": "string",
      "password": "string",
      "isActive": "boolean"
    }
}
```