import {Status} from "../enum/status.enum";

export interface Server{
  timeStamp: Date;
  statusCode: number;
  status: string;
  reason: string;
  message: string;
  developerMessage: string;
  data: {servers?: Server[], server?:Server};
}
