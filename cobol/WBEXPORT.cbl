      ******************************************************************
      * Created: Wed, 14 Feb 2024 13:57:22 GMT
      * Generated by: IBM watsonx Code Assistant for Z Refactoring
      * Assistant
      * Workbook name: demo
      * Workbook id: 4a881faa-de30-4684-bc75-58ffc2e87c83
      * Project: $demoapp_3c500e03-adfa-4fa5-9a65-8bf629692869
      ******************************************************************

       IDENTIFICATION DIVISION.
       PROGRAM-ID. WBEXPORT.

       ENVIRONMENT DIVISION.
       INPUT-OUTPUT SECTION.
       FILE-CONTROL.
      ******************************************************************
           SELECT ACCTFILE-FILE ASSIGN TO ACCTFILE
                  ORGANIZATION IS INDEXED
                  ACCESS MODE  IS SEQUENTIAL
                  RECORD KEY   IS FD-ACCT-ID
                  FILE STATUS  IS ACCTFILE-STATUS.
      ******************************************************************

       DATA DIVISION.
       FILE SECTION.
      ******************************************************************
       FD  ACCTFILE-FILE.

      ******************************************************************
      * PATH : .../zOS Cobol/CBACT01C.cbl
       01  FD-ACCTFILE-REC.
           05 FD-ACCT-ID                        PIC 9(11).
           05 FD-ACCT-DATA                      PIC X(289).
      ******************************************************************

       WORKING-STORAGE SECTION.
      ******************************************************************
       COPY CVACT01Y.
      * PATH : .../Cobol Include/CVACT01Y.CPY
      * THE FOLLOWING VARIABLES ARE USED FROM THE COPYBOOK :
      *01  ACCOUNT-RECORD.
      *    05  ACCT-ID                           PIC 9(11).
      *    05  ACCT-ACTIVE-STATUS                PIC X(01).
      *    05  ACCT-CURR-BAL                     PIC S9(10)V99.
      *    05  ACCT-CREDIT-LIMIT                 PIC S9(10)V99.
      *    05  ACCT-CASH-CREDIT-LIMIT            PIC S9(10)V99.
      *    05  ACCT-OPEN-DATE                    PIC X(10).
      *    05  ACCT-EXPIRAION-DATE               PIC X(10).
      *    05  ACCT-REISSUE-DATE                 PIC X(10).
      *    05  ACCT-CURR-CYC-CREDIT              PIC S9(10)V99.
      *    05  ACCT-CURR-CYC-DEBIT               PIC S9(10)V99.
      *    05  ACCT-ADDR-ZIP                     PIC X(10).
      *    05  ACCT-GROUP-ID                     PIC X(10).
      *    05  FILLER                            PIC X(178).
      *01  ACCTFILE-STATUS.
      *    05  ACCTFILE-STAT1      PIC X.
      *    05  ACCTFILE-STAT2      PIC X.
      *01  END-OF-FILE             PIC X(01)    VALUE 'N'.
      *01  ABCODE                  PIC S9(9) BINARY.
      *01  TIMING                  PIC S9(9) BINARY.
      *01  IO-STATUS.
      *    05  IO-STAT1            PIC X.
      *    05  IO-STAT2            PIC X.
      *01  TWO-BYTES-BINARY        PIC 9(4) BINARY.
      *01  TWO-BYTES-ALPHA         REDEFINES TWO-BYTES-BINARY.
      *    05  TWO-BYTES-RIGHT     PIC X.
      *01  IO-STATUS-04.
      *    05  IO-STATUS-0401      PIC 9   VALUE 0.
      *    05  IO-STATUS-0403      PIC 999 VALUE 0.
      *01  APPL-RESULT             PIC S9(9)   COMP.
      *    88  APPL-AOK            VALUE 0.
      *    88  APPL-EOF            VALUE 16.
      ******************************************************************

       LINKAGE SECTION.

       PROCEDURE DIVISION.
      ******************************************************************
      * PROGRAM NAME : Program:COBOL:CBACT01C
      * PROGRAM PATH : .../zOS Cobol/CBACT01C.cbl
      * STMT START LINE NUMBER : 92
      * STMT END LINE NUMBER : 116
       1000-ACCTFILE-GET-NEXT.
           READ ACCTFILE-FILE INTO ACCOUNT-RECORD.
           IF  ACCTFILE-STATUS = '00'
               MOVE 0 TO APPL-RESULT
               PERFORM 1100-DISPLAY-ACCT-RECORD
           ELSE
               IF  ACCTFILE-STATUS = '10'
                   MOVE 16 TO APPL-RESULT
               ELSE
                   MOVE 12 TO APPL-RESULT
               END-IF
           END-IF
           IF  APPL-AOK
      * TODO : CHECK THE FOLLOWING <CONTINUE/NEXT SENTENCE/GO TO/GO
      * BACK/RETURN/STOP RUN/EXIT/EXIT PROGRAM> STATEMENT
               CONTINUE
           ELSE
               IF  APPL-EOF
                   MOVE 'Y' TO END-OF-FILE
               ELSE
                   DISPLAY 'ERROR READING ACCOUNT FILE'
                   MOVE ACCTFILE-STATUS TO IO-STATUS
                   PERFORM 9910-DISPLAY-IO-STATUS
                   PERFORM 9999-ABEND-PROGRAM
               END-IF
           END-IF
      * TODO : CHECK THE FOLLOWING <CONTINUE/NEXT SENTENCE/GO TO/GO
      * BACK/RETURN/STOP RUN/EXIT/EXIT PROGRAM> STATEMENT
           EXIT.
      ******************************************************************
      * PROGRAM NAME : Program:COBOL:CBACT01C
      * PROGRAM PATH : .../zOS Cobol/CBACT01C.cbl
      * STMT START LINE NUMBER : 118
      * STMT END LINE NUMBER : 131
       1100-DISPLAY-ACCT-RECORD.
           DISPLAY 'ACCT-ID                 :'   ACCT-ID
           DISPLAY 'ACCT-ACTIVE-STATUS      :'   ACCT-ACTIVE-STATUS
           DISPLAY 'ACCT-CURR-BAL           :'   ACCT-CURR-BAL
           DISPLAY 'ACCT-CREDIT-LIMIT       :'   ACCT-CREDIT-LIMIT
           DISPLAY 'ACCT-CASH-CREDIT-LIMIT  :'   ACCT-CASH-CREDIT-LIMIT
           DISPLAY 'ACCT-OPEN-DATE          :'   ACCT-OPEN-DATE
           DISPLAY 'ACCT-EXPIRAION-DATE     :'   ACCT-EXPIRAION-DATE
           DISPLAY 'ACCT-REISSUE-DATE       :'   ACCT-REISSUE-DATE
           DISPLAY 'ACCT-CURR-CYC-CREDIT    :'   ACCT-CURR-CYC-CREDIT
           DISPLAY 'ACCT-CURR-CYC-DEBIT     :'   ACCT-CURR-CYC-DEBIT
           DISPLAY 'ACCT-GROUP-ID           :'   ACCT-GROUP-ID
           DISPLAY '-------------------------------------------------'
      * TODO : CHECK THE FOLLOWING <CONTINUE/NEXT SENTENCE/GO TO/GO
      * BACK/RETURN/STOP RUN/EXIT/EXIT PROGRAM> STATEMENT
           EXIT.
      ******************************************************************
      * PROGRAM NAME : Program:COBOL:CBACT01C
      * PROGRAM PATH : .../zOS Cobol/CBACT01C.cbl
      * STMT START LINE NUMBER : 169
      * STMT END LINE NUMBER : 173
       9999-ABEND-PROGRAM.
           DISPLAY 'ABENDING PROGRAM'
           MOVE 0 TO TIMING
           MOVE 999 TO ABCODE
           CALL 'CEE3ABD'.
      ******************************************************************
      * PROGRAM NAME : Program:COBOL:CBACT01C
      * PROGRAM PATH : .../zOS Cobol/CBACT01C.cbl
      * STMT START LINE NUMBER : 176
      * STMT END LINE NUMBER : 189
       9910-DISPLAY-IO-STATUS.
           IF  IO-STATUS NOT NUMERIC
           OR  IO-STAT1 = '9'
               MOVE IO-STAT1 TO IO-STATUS-04(1:1)
               MOVE 0        TO TWO-BYTES-BINARY
               MOVE IO-STAT2 TO TWO-BYTES-RIGHT
               MOVE TWO-BYTES-BINARY TO IO-STATUS-0403
               DISPLAY 'FILE STATUS IS: NNNN' IO-STATUS-04
           ELSE
               MOVE '0000' TO IO-STATUS-04
               MOVE IO-STATUS TO IO-STATUS-04(3:2)
               DISPLAY 'FILE STATUS IS: NNNN' IO-STATUS-04
           END-IF
      * TODO : CHECK THE FOLLOWING <CONTINUE/NEXT SENTENCE/GO TO/GO
      * BACK/RETURN/STOP RUN/EXIT/EXIT PROGRAM> STATEMENT
           EXIT.
      ******************************************************************
           EXIT PROGRAM.
