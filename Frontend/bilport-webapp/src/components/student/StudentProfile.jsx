import { Row, Col, Card, Container } from "react-bootstrap";
import ChangePassword from "../commonComponents/ChangePassword";
import useAuth from '../../hooks/useAuth';
import useAxiosPrivate from "../../hooks/useAxiosPrivate";
import { useState } from "react";
import { useEffect } from "react";
import axios from "../../api/axios";


async function fetchUserStudent(axiosInstance, auth, setStudent) {
    try {
        const response = await axiosInstance.get(`/students/${auth.user}`);
        setStudent(response.data);
    } catch (error) {
        console.error(error);
    }
}

export default function StudentProfile() {

    const { auth } = useAuth();
    const [student, setStudent] = useState([]);
    const axiosPrivate = useAxiosPrivate();

    useEffect(() => { fetchUserStudent(axiosPrivate, auth, setStudent); }, []);
    console.log(student);

    useEffect(() => {
        console.log(student);
    }, [student]);



    return(
        <div style={{ marginLeft: '250px', padding: '20px' }}>
            <h1 className = "bigPageTitle"> Profile Page </h1>
            <Card>
                <Card.Body>
                    <Container fluid>
                        <Row>
                            <Col lg = {2} style={{ color: "purple"}}>Full name:</Col>
                            <Col lg = {10}><div className = "text-secondary">{student.studentName+" "+ student.studentSurname}</div></Col>
                        </Row>
                        <hr/>
                        <Row>
                            <Col lg = {2} style={{ color: "purple"}}>Student ID:</Col>
                            <Col lg = {10} ><div className = "text-secondary">{auth.user}</div></Col>
                        </Row>
                        <hr/>
                        <Row>
                            <Col lg = {2} style={{ color: "purple"}}>Email:</Col>
                            <Col lg={10}><div className="text-secondary">{student.studentEmail}</div></Col> {/*JSON.stringify(student.email)*/}
                        </Row>
                    </Container>
                </Card.Body>
            </Card>

            <div style={{ marginTop: '50px  ' }}>
                <ChangePassword/>
            </div>

        </div>
    );
}
