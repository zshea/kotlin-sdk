package io.modelcontextprotocol.kotlin.sdk.integration.kotlin.streamablehttp

import io.modelcontextprotocol.kotlin.sdk.integration.kotlin.OldSchemaAbstractResourceIntegrationTest

class ResourceIntegrationTestStreamableHttp : OldSchemaAbstractResourceIntegrationTest() {
    override val transportKind: TransportKind = TransportKind.SSE
}
