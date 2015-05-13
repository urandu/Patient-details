<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>
<%@ include file="template/localHeader.jsp"%>

<openmrs:htmlInclude file="/moduleResources/patientdetails/js/jquery.dataTables.js" />

    <script type="text/javascript">
            $j(document).ready(function() {
                $j('#myTable').dataTable({
                    "bJQueryUI": true,
                    "sPaginationType": "full_numbers"
                });
            } );
</script>

<table id="myTable">
    <thead>
    <tr>
        <th>Encounter Id</th>
        <th>Date </th>
        <th>Visit Type</th>
        <th>Location</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="Encounter" items="${allEncounters}" varStatus="status">
        <tr>
            <td>${Encounter.encounterType.name}</td>
            <td>${Encounter.encounterDatetime}</td>
            <td>${Encounter.visit.visitType.name}</td>
            <td>${Encounter.location}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<%@ include file="/WEB-INF/template/footer.jsp"%>