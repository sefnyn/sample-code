// Download the helper library from https://www.twilio.com/docs/node/install
// Your Account Sid and Auth Token from twilio.com/console
const accountSid = 'ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX';
const authToken = 'your_auth_token';
const client = require('twilio')(accountSid, authToken);

client.video.recordingSettings()
      .create({
         awsS3Url: 'AwsS3Url=https://my-bucket.s3.amazonaws.com/recordings',
         awsStorageEnabled: true,
         awsCredentialsSid: 'CRXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX',
         friendlyName: 'Upload to external bucket'
       })
      .then(recording_settings => console.log(recording_settings.friendlyName))
      .done();
